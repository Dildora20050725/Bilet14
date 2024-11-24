import java.util.Scanner;

public class Top4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiv uzunligini kiriting:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 13) {
                i++; // 13 va undan keyingi sonni o'tkazib yuborish
            } else {
                sum += array[i];
            }
        }

        System.out.println("Elementlar yig'indisi: " + sum);
    }
}
