import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactorionChecker checker = new FactorionChecker();

        System.out.print("Enter the lower bound of the range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = sc.nextInt();

        System.out.println("Factorion numbers in the range:");
        for (int i = lower; i <= upper; i++) {
            if (checker.isFactorion(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
