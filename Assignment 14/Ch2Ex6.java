import java.util.Scanner;

public class Ch2Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int lastDigit = number % 10;
        int remaining = number / 10;
        int secondLastDigit = remaining % 10;
        int firstDigit = remaining / 10;

        int sum = lastDigit + secondLastDigit + firstDigit;

        System.out.println("The sum of the digits is " + sum);
    }
}
