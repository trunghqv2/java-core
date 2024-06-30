
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        String str = "you know what i'm thinkin , see it in your eyes ";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char inputChar = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == inputChar) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự '" + inputChar + "' trong chuỗi là: " + count);

        scanner.close();
    }
}