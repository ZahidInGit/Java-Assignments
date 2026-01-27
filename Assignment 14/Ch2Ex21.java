import java.util.Scanner;

public class Ch2Ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyRate = annualRate / 1200;
        double futureValue = amount * Math.pow(1 + monthlyRate, years * 12);

        System.out.println("Future value is $" + futureValue);
    }
}
