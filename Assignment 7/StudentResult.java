import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student ID: ");
        String studentId = input.nextLine();

        System.out.print("No. of Courses: ");
        int n = input.nextInt();

        double totalCredit = 0;
        double earnedCredit = 0;
        double totalGradePoint = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nC" + i + ":");

            System.out.print("Credit (Max 3): ");
            double credit = input.nextDouble();

            System.out.print("CT (Max 30): ");
            double ct = input.nextDouble();

            System.out.print("AT (Max 10): ");
            double at = input.nextDouble();

            System.out.print("FE (Max 60): ");
            double fe = input.nextDouble();

            double totalMarks = ct + at + fe;
            double gradePoint = getGradePoint(totalMarks);
            totalGradePoint += gradePoint * credit;

            totalCredit += credit;
            if (gradePoint > 0) {
                earnedCredit += credit;
            }
        }

        double cgpa = totalGradePoint / totalCredit;
        String grade = getLetterGrade(cgpa);

        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Credit Taken: " + (int) totalCredit);
        System.out.println("Credit Earned: " + (int) earnedCredit);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);
    }

    public static double getGradePoint(double marks) {
        if (marks >= 80) return 4.0;
        else if (marks >= 75) return 3.75;
        else if (marks >= 70) return 3.5;
        else if (marks >= 65) return 3.25;
        else if (marks >= 60) return 3.0;
        else if (marks >= 55) return 2.75;
        else if (marks >= 50) return 2.5;
        else if (marks >= 45) return 2.25;
        else if (marks >= 40) return 2.0;
        else return 0.0;
    }

    
    public static String getLetterGrade(double gpa) {
        if (gpa >= 4.0) return "A+";
        else if (gpa >= 3.75) return "A";
        else if (gpa >= 3.5) return "A-";
        else if (gpa >= 3.25) return "B+";
        else if (gpa >= 3.0) return "B";
        else if (gpa >= 2.75) return "B-";
        else if (gpa >= 2.5) return "C+";
        else if (gpa >= 2.25) return "C";
        else if (gpa >= 2.0) return "D";
        else return "F";
    }
