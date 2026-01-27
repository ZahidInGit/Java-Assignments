import java.util.Scanner;

public class Ch3Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three edges of the triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Perimeter is " + (a + b + c));
        } else {
            System.out.println("Input is invalid");
        }
    }
}
