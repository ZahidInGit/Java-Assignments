import java.util.Scanner;

public class Ch3Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = (int)(Math.random() * 100);
        int n2 = (int)(Math.random() * 100);

        System.out.print("What is " + n1 + " + " + n2 + "? ");
        int answer = input.nextInt();

        if (n1 + n2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("You are wrong. " + n1 + " + " + n2 + " should be " + (n1 + n2));
    }
}
