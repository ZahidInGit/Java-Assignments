import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("Random Integer (0-100): " + CustomRandom.nextInt(100));
        System.out.println("Random Double: " + CustomRandom.nextDouble());
        System.out.println("Random Float: " + CustomRandom.nextFloat());

        double[] myList = new double[5];
        System.out.print("\nEnter " + myList.length + " seeds (numbers) to shuffle the generator: ");
        
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }

        System.out.println("Generating numbers based on your inputs:");
        for (int i = 0; i < myList.length; i++) {
            int randomVal = CustomRandom.nextInt(1, 50); 
            System.out.println("Index " + i + " generated: " + randomVal);
        }
        
        input.close();
    }
}
