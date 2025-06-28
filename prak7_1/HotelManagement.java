import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelManagement {
    private List<Room> rooms;
    private List<Tenant> tenants;
    private List<Transaction> transactions;

    public HotelManagement() {
        rooms = new ArrayList<>();
        tenants = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void loadRoomsFromConfig(String configFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(configFilePath))) {
            int totalRooms = Integer.parseInt(br.readLine().trim());
            int singleRooms = totalRooms / 3;
            int doubleRooms = totalRooms / 3;
            int suiteRooms = totalRooms - singleRooms - doubleRooms;

            int roomNumber = 1;
            for (int i = 0; i < singleRooms; i++) {
                rooms.add(new Room(roomNumber++, Room.RoomType.SINGLE));
            }
            for (int i = 0; i < doubleRooms; i++) {
                rooms.add(new Room(roomNumber++, Room.RoomType.DOUBLE));
            }
            for (int i = 0; i < suiteRooms; i++) {
                rooms.add(new Room(roomNumber++, Room.RoomType.SUITE));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading config file: " + e.getMessage());
        }
    }

    public void addTenant(Tenant tenant) {
        tenants.add(tenant);
    }

    public Room findAvailableRoom(Room.RoomType type) {
        for (Room room : rooms) {
            if (room.getType() == type && room.getStatus() == Room.RoomStatus.EMPTY) {
                return room;
            }
        }
        return null;
    }

    public void bookRoom(Tenant tenant, Room.RoomType type) {
        Room room = findAvailableRoom(type);
        if (room == null) {
            System.out.println("No available " + type + " rooms.");
            return;
        }
        room.setStatus(Room.RoomStatus.BOOKED);
        tenants.add(tenant);
        transactions.add(new Transaction(tenant, room));
        System.out.println("Room " + room.getRoomNumber() + " booked for " + tenant.getName());
    }

    public void checkIn(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (room.getStatus() == Room.RoomStatus.BOOKED) {
                    room.setStatus(Room.RoomStatus.OCCUPIED);
                    System.out.println("Checked in to room " + roomNumber);
                } else {
                    System.out.println("Room " + roomNumber + " is not booked.");
                }
                return;
            }
        }
        System.out.println("Room " + roomNumber + " not found.");
    }

    public void checkOut(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (room.getStatus() == Room.RoomStatus.OCCUPIED) {
                    room.setStatus(Room.RoomStatus.EMPTY);
                    System.out.println("Checked out from room " + roomNumber);
                } else {
                    System.out.println("Room " + roomNumber + " is not occupied.");
                }
                return;
            }
        }
        System.out.println("Room " + roomNumber + " not found.");
    }

    public void showRoomStatus() {
        int occupiedCount = 0;
        int emptyCount = 0;
        int bookedCount = 0;
        for (Room room : rooms) {
            System.out.println(room);
            switch (room.getStatus()) {
                case OCCUPIED:
                    occupiedCount++;
                    break;
                case EMPTY:
                    emptyCount++;
                    break;
                case BOOKED:
                    bookedCount++;
                    break;
            }
        }
        System.out.println("Summary:");
        System.out.println("Occupied rooms: " + occupiedCount);
        System.out.println("Empty rooms: " + emptyCount);
        System.out.println("Booked rooms: " + bookedCount);
    }

    public void showTenantData() {
        Map<Tenant, List<Room>> tenantRooms = new HashMap<>();
        Map<Tenant, Integer> tenantStayCount = new HashMap<>();

        for (Transaction transaction : transactions) {
            Tenant tenant = transaction.getTenant();
            Room room = transaction.getRoom();

            tenantRooms.computeIfAbsent(tenant, k -> new ArrayList<>()).add(room);
            tenantStayCount.put(tenant, tenantStayCount.getOrDefault(tenant, 0) + 1);
        }

        System.out.println("Tenant Data:");
        for (Tenant tenant : tenantRooms.keySet()) {
            System.out.println(tenant);
            System.out.print("Rooms rented: ");
            List<Room> roomsRented = tenantRooms.get(tenant);
            for (Room room : roomsRented) {
                System.out.print(room.getRoomNumber() + " ");
            }
            System.out.println();
        }

        System.out.println("Frequent Tenants:");
        tenantStayCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .forEach(entry -> System.out.println(entry.getKey().getName() + " - " + entry.getValue() + " stays"));
    }

    public void showTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public void showTransactionsByPeriod(Scanner scanner) {
        System.out.print("Enter year (YYYY): ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter month (1-12, or 0 for whole year): ");
        int month = scanner.nextInt();
        scanner.nextLine(); // consume newline

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int totalTransactions = 0;
        int totalRevenue = 0;

        for (Transaction transaction : transactions) {
            LocalDate date = transaction.getDate();
            if (date.getYear() == year && (month == 0 || date.getMonthValue() == month)) {
                System.out.println(transaction);
                totalTransactions++;
                totalRevenue += transaction.getRoom().getPrice();
            }
        }

        System.out.println("Total transactions: " + totalTransactions);
        System.out.println("Total revenue: Rp. " + totalRevenue);
    }

    public static void main(String[] args) {
        HotelManagement hm = new HotelManagement();
        Scanner scanner = new Scanner(System.in);

        hm.loadRoomsFromConfig("prak7_1/config.txt");

        while (true) {
            System.out.println("\nSistem Manajemen Hotel");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Check In");
            System.out.println("3. Check Out");
            System.out.println("4. Tampilkan Status Kamar");
            System.out.println("5. Tampilkan Transaksi");
            System.out.println("6. Tampilkan Data Penyewa");
            System.out.println("7. Tampilkan Transaksi Berdasarkan Periode");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID penyewa (KTP/SIM): ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan nama penyewa: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan alamat penyewa: ");
                    String address = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon penyewa: ");
                    String phone = scanner.nextLine();
                    Tenant tenant = new Tenant(id, name, address, phone);

                    System.out.print("Masukkan tipe kamar yang ingin dipesan (SINGLE, DOUBLE, SUITE): ");
                    String typeStr = scanner.nextLine().toUpperCase();
                    Room.RoomType type;
                    try {
                        type = Room.RoomType.valueOf(typeStr);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Tipe kamar tidak valid.");
                        break;
                    }
                    hm.bookRoom(tenant, type);
                    break;
                case 2:
                    System.out.print("Masukkan nomor kamar untuk check in: ");
                    int checkInRoom = scanner.nextInt();
                    hm.checkIn(checkInRoom);
                    break;
                case 3:
                    System.out.print("Masukkan nomor kamar untuk check out: ");
                    int checkOutRoom = scanner.nextInt();
                    hm.checkOut(checkOutRoom);
                    break;
                case 4:
                    hm.showRoomStatus();
                    break;
                case 5:
                    hm.showTransactions();
                    break;
                case 6:
                    hm.showTenantData();
                    break;
                case 7:
                    hm.showTransactionsByPeriod(scanner);
                    break;
                case 8:
                    System.out.println("Keluar...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}
