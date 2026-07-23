package exceptionhandling;

public class Person {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                System.out.println("Usage: java Person <Name> <Age>");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age should be >=18 and <60");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);

        } catch (NumberFormatException e) {

            System.out.println("Age must be a number");

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }
    }
}