import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Lab2 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("Input.txt");
        Scanner sc = new Scanner(inputFile);
        sc.useDelimiter(",\\s*");
        
        PrintWriter writer = new PrintWriter("Output.txt");
        
        int highest = Integer.MIN_VALUE;
        int sum = 0;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += num;
            if (num > highest) {
                highest = num;
            }
        }

        writer.println("Highest Value: " + highest);
        writer.println("Sum: " + sum);

        sc.close();
        writer.close();
    }
}
