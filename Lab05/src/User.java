import java.time.LocalDate;

public class User {
    protected  String name;
    protected  LocalDate dob ;

    public User() {
        this.name = null;
        this.dob = LocalDate.now(); // current date
    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    void displayInfo(){
        System.out.println("Name " + this.name);
        System.out.println("Birthday " + this.dob);
    }
}
