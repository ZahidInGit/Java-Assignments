import java.util.Scanner;

public class Ch2Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double population = 312032486;
        double secondsInYear = 365 * 24 * 60 * 60;

        double births = secondsInYear / 7.0;
        double deaths = secondsInYear / 13.0;
        double immigrants = secondsInYear / 45.0;

        for (int i = 0; i < years; i++) {
            population += births + immigrants - deaths;
        }

        System.out.println("The population in " + years + " years is " + (long)population);
    }
}
