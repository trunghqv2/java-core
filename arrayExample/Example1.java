import java.util.Scanner;

public class Example1 {
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

        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println(
                "Giá trị lớn nhất trong ma trận là " + maxValue + " tại tọa độ (" + maxRow + ", " + maxCol + ")");

        scanner.close();
    }
}