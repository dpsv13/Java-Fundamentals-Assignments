import java.io.Serializable;

public class EmployeeRecord implements Serializable {

    private int id;
    private String name;
    private int age;
    private double salary;

    public EmployeeRecord(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age + " " + salary);
    }
}