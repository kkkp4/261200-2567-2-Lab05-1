import java.time.LocalDate;

public class Admin extends User {

    // Constructors
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day); // ใช้ constructor ของ User
    }

    public Admin() {
        super(); // ใช้ default constructor ของ User
    }

    // Display basic info
    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Birthday: " + this.dob);
        System.out.println("User type: admin.");
    }

    // Overloaded displayInfo with full details
    void displayInfo(boolean full) {
        if (full) {
            System.out.println("Name: " + this.name);
            System.out.println("Birthday: " + this.dob);
            System.out.println("User type: admin.");
            System.out.println("Today: " + LocalDate.now());
        } else {
            System.out.println("Name: " + this.name);
        }
    }
}
