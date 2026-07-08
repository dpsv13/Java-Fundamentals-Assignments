import java.util.Arrays;

public class LargestSmallestTwo {
    public static void main(String[] args) {

        int[] arr = {12, 45, 6, 89, 23, 78, 1};

        Arrays.sort(arr);

        System.out.println("Smallest 2 Numbers: " + arr[0] + " " + arr[1]);

        System.out.println("Largest 2 Numbers: " + arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}