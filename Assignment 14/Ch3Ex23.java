import java.util.Scanner;

public class Ch3Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Width is 10 (bounds -5 to 5), Height is 5 (bounds -2.5 to 2.5)
        boolean inX = Math.abs(x) <= 10.0 / 2;
        boolean inY = Math.abs(y) <= 5.0 / 2;

        if (inX && inY) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
