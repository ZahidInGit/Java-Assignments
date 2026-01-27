import java.util.Scanner;

public class Ch2Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double energy = kilograms * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is " + energy);
    }
}
