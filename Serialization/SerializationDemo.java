package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationDemo {

    public static void main(String[] args) {

        try {

            EmployeeSerialize emp = new EmployeeSerialize(
                    "Rahul",
                    new Date(),
                    "IT",
                    "Software Engineer",
                    60000.0);

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("data"));

            oos.writeObject(emp);
            oos.close();

            System.out.println("Object Serialized Successfully.");

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("data"));

            EmployeeSerialize e =
                    (EmployeeSerialize) ois.readObject();

            ois.close();

            System.out.println("\nEmployee Details");
            System.out.println("----------------------");
            System.out.println("Name        : " + e.getName());
            System.out.println("DOB         : " + e.getDateOfBirth());
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}