import java.util.Scanner;

public class Top6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiv uzunligini kiriting:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("A va B qiymatlarini kiriting:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        boolean isEqual = checkSum(array, A, true) || checkSum(array, B, false);
        System.out.println("Natija: " + isEqual);
    }

    public static boolean checkSum(int[] array, int target, boolean isEven) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                if (isEven && array[j] % 2 == 0 || !isEven && array[j] % 2 != 0) {
                    if (sum == 0 || array[j] == array[j - 1]) {
                        sum += array[j];
                    }
                } else {
                    break;
                }
                if (sum == target) return true;
            }
        }
        return false;
    }
}
