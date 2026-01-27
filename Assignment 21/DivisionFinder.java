import java.util.Scanner;

public class DivisorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            int num;
            while (true) {
                System.out.print("Please enter a positive integer: ");
                num = input.nextInt();
                if (num > 0) {
                    break;
                }
                System.out.println(num + " is not a positive integer.");
            }

            for (int i = num; i >= 1; i--) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }

            while (true) {
                System.out.print("\nWould you like to see the divisors of another integer (Y/N)? ");
                choice = input.next().toLowerCase().charAt(0);
                
                if (choice == 'y' || choice == 'n') {
                    break;
                }
                System.out.println("Please respond with Y (or y) for yes and N (or n) for no.");
            }

        } while (choice == 'y');
        
        input.close();
    }
}
