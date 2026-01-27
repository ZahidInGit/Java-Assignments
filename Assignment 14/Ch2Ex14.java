import java.util.Scanner;

public class Ch2Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightLbs = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        double weightKg = weightLbs * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is " + bmi);
    }
}
