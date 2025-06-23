public class Tenant {
    private String id; // no KTP/SIM
    private String name;
    private String address;
    private String phone;

    public Tenant(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "ID='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                ", Phone='" + phone + '\'' +
                '}';
    }
}
