public class Ch1Ex10 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double miles = kilometers / 1.6;
        double timeInHours = 45.0 / 60.0 + 30.0 / 3600.0;

        double averageSpeed = miles / timeInHours;

        System.out.println("The average speed in miles per hour is:");
        System.out.println(averageSpeed);
    }
}
