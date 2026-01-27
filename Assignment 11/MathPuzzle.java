import java.util.*;
import java.io.*;

public class MathPuzzle {
    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter difficulty level (Easy/Hard): ");
        String level = sc.nextLine();

        int score = 0;

        try {
            File questionFile = new File("questions.txt");
            Scanner fileScanner = new Scanner(questionFile);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("=");
                String question = parts[0];
                int correctAnswer = Integer.parseInt(parts[1].trim());

                System.out.print(question + "= ? ");
                int userAnswer = sc.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score += 10;
                } else {
                    System.out.println("Wrong!");
                }
            }
            fileScanner.close();
            saveScore(name, level, score);

        } catch (FileNotFoundException e) {
            System.out.println("Error: questions.txt not found.");
        }
    }

    private void saveScore(String name, String level, int score) {
        try (PrintWriter out = new PrintWriter(new FileWriter("scores.txt", true))) {
            out.println("Player: " + name + " | Level: " + level + " | Score: " + score);
            System.out.println("Score saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving score.");
        }
    }
}
