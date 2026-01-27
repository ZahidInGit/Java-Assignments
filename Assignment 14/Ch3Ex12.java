import java.util.Scanner;

public class Ch3Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();

        // abs() handles negative numbers simply as requested
        int absNum = Math.abs(num);
        int digit1 = absNum / 100;
        int digit3 = absNum % 10;

        if (digit1 == digit3)
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
    }
}
