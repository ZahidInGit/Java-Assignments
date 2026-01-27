import java.util.Scanner;

public class Ch2Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double monthlyInterestRate = 0.00417;
        double total = 0;

        total = (savingAmount + total) * (1 + monthlyInterestRate);
        total = (savingAmount + total) * (1 + monthlyInterestRate);
        total = (savingAmount + total) * (1 + monthlyInterestRate);
        total = (savingAmount + total) * (1 + monthlyInterestRate);
        total = (savingAmount + total) * (1 + monthlyInterestRate);
        total = (savingAmount + total) * (1 + monthlyInterestRate);

        System.out.println("After the sixth month, the account value is $" + total);
    }
}
