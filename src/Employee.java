import java.util.Objects;

public class Employee {
    private final String name;
    private int unit;
    private int salary;
    private static int count;
    private final int id;

    public Employee(String name, int unit, int salary) {
        this.name = name;
        this.unit = unit;
        this.salary = salary;
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public int getUnit() {
        return unit;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int setUnit(int unit) {
        if (unit < 1 && unit > 5) {
            throw new IllegalArgumentException("Отделов только пять.");
        }
        return unit;
    }


    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return unit == employee.unit && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    public int hashCode() {
        return Objects.hash(name, unit, salary, id);
    }

}
