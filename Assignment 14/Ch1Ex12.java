public class Ch1Ex12 {
    public static void main(String[] args) {
        double miles = 24.0;
        double kilometers = miles * 1.6;
        double hours = 1.0;
        double minutes = 40.0;
        double seconds = 35.0;
        double totalHours = hours + (minutes / 60.0) + (seconds / 3600.0);
        double averageSpeed = kilometers / totalHours;
        System.out.println("The average speed in kilometers per hour is: " + averageSpeed);
    }
}
