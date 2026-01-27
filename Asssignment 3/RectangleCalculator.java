import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
