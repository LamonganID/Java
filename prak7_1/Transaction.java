public class Transaction {
    private Tenant tenant;
    private Room room;

    public Transaction(Tenant tenant, Room room) {
        this.tenant = tenant;
        this.room = room;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "tenant=" + tenant.getName() +
                ", room=" + room.getRoomNumber() +
                ", roomType=" + room.getType() +
                ", price=Rp. " + room.getPrice() +
                '}';
    }
}
