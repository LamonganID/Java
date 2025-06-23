public class Room {
    public enum RoomType {
        SINGLE, DOUBLE, SUITE
    }

    public enum RoomStatus {
        EMPTY, BOOKED, OCCUPIED
    }

    private int roomNumber;
    private RoomType type;
    private RoomStatus status;
    private int price;

    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.status = RoomStatus.EMPTY;
        switch (type) {
            case SINGLE:
                this.price = 175000;
                break;
            case DOUBLE:
                this.price = 225000;
                break;
            case SUITE:
                this.price = 300000;
                break;
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - Status: " + status + " - Price: Rp. " + price;
    }
}
