import java.util.Scanner;

public class Top5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N va M qiymatlarini kiriting:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        System.out.println("Massiv elementlarini kiriting:");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] > max) max = array[i][j];
                if (array[i][j] < min) min = array[i][j];
            }
        }

        System.out.println("Yig'indisi: " + (max + min));
    }
}
