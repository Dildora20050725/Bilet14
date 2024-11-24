import java.util.Scanner;

public class Top2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n va k sonlarini kiriting (n < k):");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long product = 1;

        for (int i = n; i <= k; i++) {
            product *= i;
        }

        System.out.println("Ko'paytma: " + product);
    }
}
