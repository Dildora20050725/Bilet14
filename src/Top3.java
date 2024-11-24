import java.util.Scanner;

public class Top3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sonni kiriting:");
        int n = scanner.nextInt();
        boolean isPrime = true;

        if (n < 2) isPrime = false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " tub son.");
        } else {
            System.out.println(n + " tub son emas.");
        }
    }
}
