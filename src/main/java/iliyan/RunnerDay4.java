package iliyan;

import java.beans.IntrospectionException;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Scanner;

public class RunnerDay4 {
    private static boolean checkIfMonthIsValid(int month) {
        return month > 0 && month <= 12;
    }

    private static boolean checkIfDayIsValid(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        int maxDays = calendar.getActualMaximum(Calendar.DATE);
        return day > maxDays;
    }

    public static void main(String[] args) {
        // TODO not finished!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of birth...");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int yearOfBirth = scanner.nextInt();
        int monthOfBirth;
        System.out.println("Enter month of birth...");
        while (!scanner.hasNextInt() && !checkIfMonthIsValid(scanner.nextInt())) {
            scanner.next();
        }
        monthOfBirth = scanner.nextInt();
        int dayOfBirth;
        System.out.println("Enter day of birth...");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        dayOfBirth = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        Person person = new Person(birthDate);
        System.out.println("New Person added to a file!");
    }
}
