import java.util.Scanner;

public class Top1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String kiriting:");
        String input = scanner.nextLine();

        String result = input.replace(" ", "+");
        System.out.println("Natija: " + result);
    }
}
