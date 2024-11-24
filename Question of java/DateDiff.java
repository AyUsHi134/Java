import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (format: dd-MM-yyyy):");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println("Enter the second date (format: dd-MM-yyyy):");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        scanner.close();

        Period period = Period.between(firstDate, secondDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Date difference: " + years + " years, " + months + " months, " + days + " days");
    }
}