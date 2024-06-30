import java.util.Scanner;

public class TriangleClassifier {
    public static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Không phải là tam giác";
        } else if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a == b || b == c || c == a) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return "Tam giác vuông cân";
            } else {
                return "Tam giác cân";
            }
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào cạnh a:");
        int a = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Nhập vào cạnh b:");
        int b = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Nhập vào cạnh c:");
        int c = Integer.parseInt(scanner.nextLine());

        String result = classifyTriangle(a, b, c);
        System.out.println("Loại tam giác: " + result);
    }
}