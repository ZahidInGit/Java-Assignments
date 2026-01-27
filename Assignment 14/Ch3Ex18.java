import java.util.Scanner;
public class Ch3Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        if (weight > 20)
            System.out.println("The package cannot be shipped.");
        else if (weight <= 0)
            System.out.println("Invalid input.");
        else {
            double cost = 0;
            if (weight <= 1) cost = 3.5;
            else if (weight <= 3) cost = 5.5;
            else if (weight <= 10) cost = 8.5;
            else cost = 10.5; // weight <= 20

            System.out.println("Shipping cost: $" + cost);
        }
    }
}
