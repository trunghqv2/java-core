import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Nhập vào ngày (định dạng yyyy-MM-dd):");
        String input = scanner.nextLine();

        LocalDate date = LocalDate.parse(input, formatter);
        LocalDate nextDay = NextDayCalculator.getNextDay(date);

        System.out.println("Ngày tiếp theo là: " + nextDay.format(formatter));
    }
}
