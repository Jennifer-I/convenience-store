package jennifer.org.model;

import jennifer.org.Enums.Gender;

public class Manager extends Person {
    private Staff staff;


    public Manager(String name, Integer phoneNo, Gender gender, Staff staff) {
        super(name, phoneNo, gender);
        this.staff = staff;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}






