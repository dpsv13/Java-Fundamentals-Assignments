
package exceptionhandling;
public class MathOperation {

    public static void main(String[] args) throws Exception {

        if (args.length != 5) {
            System.out.println("Please enter exactly 5 integers.");
            return;
        }

        int sum = 0;
        int arr[] = new int[5];

        try {

            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }

            double average = (double) sum / arr.length;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException");
        }

    }
}