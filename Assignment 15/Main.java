import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();

        Circle myCircle = new Circle(r);

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.calculateArea());

        scanner.close();
    }
}
