import java.util.Scanner;

public class Ch2Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
