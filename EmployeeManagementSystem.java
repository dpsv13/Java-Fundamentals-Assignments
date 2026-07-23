import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {

    static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    EmployeeRecord emp = new EmployeeRecord(id, name, age, salary);

                    try {

                        File file = new File(FILE_NAME);
                        FileOutputStream fos = new FileOutputStream(file, true);
                        ObjectOutputStream oos;

                        if (file.length() == 0) {
                            oos = new ObjectOutputStream(fos);
                        } else {
                            oos = new AppendableObjectOutputStream(fos);
                        }

                        oos.writeObject(emp);
                        oos.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;

                case 2:

                    System.out.println("-----Report-----");

                    File file = new File(FILE_NAME);

                    if (!file.exists() || file.length() == 0) {
                        System.out.println("No employee records found.");
                        break;
                    }

                    try (ObjectInputStream ois =
                            new ObjectInputStream(new FileInputStream(FILE_NAME))) {

                        while (true) {
                            EmployeeRecord e = (EmployeeRecord) ois.readObject();
                            e.display();
                        }

                    } catch (EOFException e) {

                        System.out.println("-----End of Report-----");

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                    break;

                case 3:

                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}

class AppendableObjectOutputStream extends ObjectOutputStream {

    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}