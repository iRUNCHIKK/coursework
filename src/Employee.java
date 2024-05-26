import java.util.Objects;

public class Employee {
    private final String fullName;
    private int salary;
    private int department;
    private final int id;
    private static int counter;
    public Employee(String fullName, int  salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        id = ++counter;
    }
    public String getFullName() {
        return fullName;
    }
    public int getSalary() {
        return salary;
    }
    public int getDepartment() {
        return department;
    }
    public int getId() {
        return id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public boolean equals (Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return salary == employee.salary && department == employee.department && id == employee.id && Objects.equals(fullName, employee.fullName);
    }
    public int hashCode() {
        return Objects.hash(fullName, salary, department, id);
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Имя и фамилия: " + fullName +
                ", зарплата: " + salary +
                ", отдел: " + department +
                ", id: " + id;
    }
}