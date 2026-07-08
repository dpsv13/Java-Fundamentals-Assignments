import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {25, 12, 9, 56, 3};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}