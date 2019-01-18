import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DayDemo {
    public static void main(String[] args) {
        /**
         *
         */
        System.out.println("请输入认识的时间（格式20181031）");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String birthDay = scanner.next();
            LocalDate birthdayDate = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("yyyyMMdd"));
            LocalDate today = LocalDate.now();
            long days = birthdayDate.until(today, ChronoUnit.DAYS);
            System.out.println("你" + days + "天");
        }
    }
}
