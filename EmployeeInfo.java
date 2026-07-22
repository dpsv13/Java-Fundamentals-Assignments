public class EmployeeInfo {
    private int id;
    private String name;

    public EmployeeInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}