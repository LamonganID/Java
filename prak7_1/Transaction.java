import java.time.LocalDate;

public class Transaction {
    private Tenant tenant;
    private Room room;
    private LocalDate date;

    public Transaction(Tenant tenant, Room room) {
        this.tenant = tenant;
        this.room = room;
        this.date = LocalDate.now();
    }

    public Transaction(Tenant tenant, Room room, LocalDate date) {
        this.tenant = tenant;
        this.room = room;
        this.date = date;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "tenant=" + tenant.getName() +
                ", room=" + room.getRoomNumber() +
                ", roomType=" + room.getType() +
                ", price=Rp. " + room.getPrice() +
                ", date=" + date +
                '}';
    }
}
