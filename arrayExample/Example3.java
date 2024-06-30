
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        int rows = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        int cols  = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
       
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println("\n");
        }
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(
            "Tổng các giá trị trong ma trận là " + sum  );


        scanner.close();
    }
}