import java.util.Scanner;

public class Ch3Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1-12) and year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        int days = 31;
        String monthName = "";

        switch (month) {
            case 2:
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                days = isLeapYear ? 29 : 28;
                monthName = "February";
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                // Assign names for these specific months
                if (month == 4) monthName = "April";
                if (month == 6) monthName = "June";
                if (month == 9) monthName = "September";
                if (month == 11) monthName = "November";
                break;
            default:
                days = 31;
                switch(month) {
                    case 1: monthName = "January"; break;
                    case 3: monthName = "March"; break;
                    case 5: monthName = "May"; break;
                    case 7: monthName = "July"; break;
                    case 8: monthName = "August"; break;
                    case 10: monthName = "October"; break;
                    case 12: monthName = "December"; break;
                }
        }
        System.out.println(monthName + " " + year + " has " + days + " days");
    }
}
