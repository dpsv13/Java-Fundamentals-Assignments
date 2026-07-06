public class PrimeBetween10And99 {
    public static void main(String[] args) {

        for (int n = 10; n <= 99; n++) {

            boolean isPrime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n);
            }
        }
    }
}