package exceptionhandling;

import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name:");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter Marks in 3 Subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeValueException("Negative marks are not allowed");
                    }

                    if (mark > 100) {
                        throw new OutOfRangeException("Marks should be between 0 and 100");
                    }

                    total += mark;
                }

                System.out.println(name + " Average = " + (total / 3.0));
            }

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");

        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());

        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}