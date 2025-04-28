package Project_15;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.TextStyle;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        for (int month = 1; month <= 12; month++) {
            LocalDate dates = LocalDate.of(year, month, 1);
            String monthName = dates.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            int daysOfMonth = dates.lengthOfMonth();
            System.out.println(monthName + " " + year);
            System.out.println("-------------------------------");
            System.out.printf("%3s%3s%3s%3s%3s%3s%3s%n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
            int dayOfWeek = dates.getDayOfWeek().getValue();
            for (int i = 1; i < dayOfWeek; i++) {
                System.out.printf("%4s", "");
            }
            for (int i = 1; i <= daysOfMonth; i++) {
                System.out.printf("%4d", i);
                if ((dayOfWeek + i - 1) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.printf("%n%n");
        }
        input.close();
    }
}    