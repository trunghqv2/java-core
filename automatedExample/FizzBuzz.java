
import java.util.Scanner;

public class FizzBuzz {

    public static String translate(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        String numberStr = String.valueOf(number);
        boolean contains3 = numberStr.contains("3");
        boolean contains5 = numberStr.contains("5");

        if (isDivisibleBy3 && isDivisibleBy5) {
            return "FizzBuzz";
        } else if (isDivisibleBy3) {
            return "Fizz";
        } else if (isDivisibleBy5) {
            return "Buzz";
        } else if (contains3) {
            return "Fizz";
        } else if (contains5) {
            return "Buzz";
        } else if (number < 100) {
            return convertNumberToWords(number);
        } else {
            return numberStr;
        }
    }

    private static String convertNumberToWords(int number) {
        String[] units = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
        String[] tens = { "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi",
                "chín mươi" };

        if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return "mười " + units[number % 10];
        } else {
            int unit = number % 10;
            int ten = number / 10;
            return tens[ten] + (unit != 0 ? " " + units[unit] : "");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 so nguyen");
        int numbers = Integer.parseInt(scanner.nextLine());

        String result = translate(numbers);
        String world = convertNumberToWords(numbers);
        System.out.println("chia het cho " + result + "đọc là" + world);

    }
}