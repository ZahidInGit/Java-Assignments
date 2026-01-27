import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Question[] questions = {
            new Question("What is the capital of France?\n(a) Berlin\n(b) Paris\n(c) Rome", "b"),
            new Question("Which planet is known as the Red Planet?\n(a) Mars\n(b) Venus\n(c) Jupiter", "a"),
            new Question("What is 5 + 7?\n(a) 10\n(b) 11\n(c) 12", "c")
        };

        runQuiz(questions);
    }

    public static void runQuiz(Question[] questions) {
        int score = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase(questions[i].answer)) {
                score++;
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);
        input.close();
    }
} 
