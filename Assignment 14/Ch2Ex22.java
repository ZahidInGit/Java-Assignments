import java.util.Scanner;

public class Ch2Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount as an integer, for example 1156 for 11.56: ");
        int amount = input.nextInt();

        int dollars = amount / 100;
        int cents = amount % 100;

        System.out.println("Your amount " + amount + " represents " + dollars + " dollars and " + cents + " cents");
    }
}
