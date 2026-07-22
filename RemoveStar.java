import java.util.Scanner;

public class RemoveStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int star = str.indexOf('*');

        if (star != -1) {
            String left = "";
            String right = "";

            if (star > 1)
                left = str.substring(0, star - 1);

            if (star < str.length() - 2)
                right = str.substring(star + 2);

            System.out.println(left + right);
        } else {
            System.out.println(str);
        }

        sc.close();
    }
}