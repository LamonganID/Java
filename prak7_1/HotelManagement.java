import java.io.*;
import java.util.*;

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
            // For simplicity, distribute rooms equally among types
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
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public void showTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public static void main(String[] args) {
        HotelManagement hm = new HotelManagement();
        Scanner scanner = new Scanner(System.in);

        hm.loadRoomsFromConfig("prak7_1/config.txt");

        while (true) {
            System.out.println("\nHotel Management System");
            System.out.println("1. Book Room");
            System.out.println("2. Check In");
            System.out.println("3. Check Out");
            System.out.println("4. Show Room Status");
            System.out.println("5. Show Transactions");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter tenant ID (KTP/SIM): ");
                    String id = scanner.nextLine();
                    System.out.print("Enter tenant name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter tenant address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter tenant phone: ");
                    String phone = scanner.nextLine();
                    Tenant tenant = new Tenant(id, name, address, phone);

                    System.out.print("Enter room type to book (SINGLE, DOUBLE, SUITE): ");
                    String typeStr = scanner.nextLine().toUpperCase();
                    Room.RoomType type;
                    try {
                        type = Room.RoomType.valueOf(typeStr);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid room type.");
                        break;
                    }
                    hm.bookRoom(tenant, type);
                    break;
                case 2:
                    System.out.print("Enter room number to check in: ");
                    int checkInRoom = scanner.nextInt();
                    hm.checkIn(checkInRoom);
                    break;
                case 3:
                    System.out.print("Enter room number to check out: ");
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
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
