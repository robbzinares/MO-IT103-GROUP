package employee;

public class EmployeeDetails {
    private int id;
    private String name;
    private String position;
    private String address;
    private int phoneNumber;

    // Constructor
    public EmployeeDetails(int id, String name, String position, String address, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
