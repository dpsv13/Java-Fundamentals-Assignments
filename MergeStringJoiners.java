import java.util.Scanner;
import java.util.StringJoiner;

public class MergeStringJoiners {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities for s1: ");
        int n1 = sc.nextInt();

        StringJoiner s1 = new StringJoiner("-");

        System.out.println("Enter cities:");
        for (int i = 0; i < n1; i++) {
            s1.add(sc.next());
        }

        System.out.print("Enter number of cities for s2: ");
        int n2 = sc.nextInt();

        StringJoiner s2 = new StringJoiner("-");

        System.out.println("Enter cities:");
        for (int i = 0; i < n2; i++) {
            s2.add(sc.next());
        }

        // s1 merged to s2
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s2);
        merge1.merge(s1);

        // s2 merged to s1
        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s1);
        merge2.merge(s2);

        System.out.println("\ns1 merged to s2:");
        System.out.println(merge1);

        System.out.println("\ns2 merged to s1:");
        System.out.println(merge2);

        sc.close();
    }
}