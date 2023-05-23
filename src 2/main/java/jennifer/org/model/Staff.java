package jennifer.org.model;

public  abstract class Staff{
    private Double salary;
    private String employeeId;
    private String Email;

    public Staff(Double salary, String employeeId, String email) {
        this.salary = salary;
        this.employeeId = employeeId;
        Email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}



