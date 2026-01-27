import java.util.Scanner;

public class Ch3Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 0 is Head, 1 is Tail
        int coin = (int)(Math.random() * 2);

        System.out.print("Guess head (0) or tail (1): ");
        int guess = input.nextInt();

        if (guess == coin)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}
