import java.util.Scanner;

public class Ch3Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double speed = input.nextDouble();

        boolean validTemp = (temp >= -58 && temp <= 41);
        boolean validSpeed = (speed >= 2);

        if (validTemp && validSpeed) {
            double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
            System.out.println("The wind chill index is " + windChill);
        } else {
            System.out.print("The ");
            if (!validTemp) System.out.print("temperature ");
            if (!validTemp && !validSpeed) System.out.print("and ");
            if (!validSpeed) System.out.print("wind speed ");
            System.out.println("is invalid");
        }
    }
}
