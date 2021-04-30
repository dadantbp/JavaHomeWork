package JavaHomeWork2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int[] countDayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        if (day <= countDayInMonth[month - 1] && day > 0 ) {
            System.out.println("Day " + day + " is present in the month");
        } else {
            System.out.println("Day " + day + " is missing in the month");
        }
    }
}
