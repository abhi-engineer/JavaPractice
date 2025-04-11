package employeManagerConsoleApp.entity;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private float salary;
    private String email;
    private String phone;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Employee(int id, String name, String dept, float salary, String email, String phone) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.email = email;
        this.phone = phone;

    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
