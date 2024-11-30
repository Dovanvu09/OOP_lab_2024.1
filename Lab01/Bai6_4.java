import java.util.Scanner;

public class Bai6_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter again.");
                continue;
            }

            int daysInMonth;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                default:
                    daysInMonth = 0;
            }

            System.out.printf("Number of days in month %d of year %d is: %d\n", month, year, daysInMonth);
            break;
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Year " + year + " is a leap year.");
            return true;
        } else {
            System.out.println("Year " + year + " is a leap year.");
            return false;
        }
    }
}
