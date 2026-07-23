public class EmployeeClone implements Cloneable {

    private int id;
    private String name;
    private double salary;

    public EmployeeClone(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        EmployeeClone emp1 = new EmployeeClone(101, "Rahul", 50000);

        EmployeeClone emp2 = (EmployeeClone) emp1.clone();

        // Change original object
        emp1.setName("Amit");
        emp1.setSalary(60000);

        System.out.println("Original Employee");
        emp1.display();

        System.out.println();

        System.out.println("Cloned Employee");
        emp2.display();

        System.out.println();
        System.out.println("Observation:");
        System.out.println("Changes made to the original object do not affect the cloned object.");
    }
}