import java.util.Scanner;

public class Ch3Ex30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;

        long currentHour = (totalHours + offset) % 24;

        String period = "AM";
        if (currentHour >= 12) {
            period = "PM";
        }

        // Convert to 12-hour format
        long hour12 = currentHour;
        if (currentHour >= 13) {
            hour12 = currentHour - 12;
        } else if (currentHour == 0) {
            hour12 = 12;
        }

        System.out.println("The current time is " + hour12 + ":" + currentMinute + ":" + currentSecond + " " + period);
    }
}
