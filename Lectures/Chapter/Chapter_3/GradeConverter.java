package Lectures.Chapter.Chapter_3;
import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your score out of 100: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter an integer between 0 and 100.");
        } else {
            int gradeLevel = score / 10;
            String grade;

            switch (gradeLevel) {
                case 10:
                case 9:
                    grade = "Excellent";
                    break;
                case 8:
                    if (score >= 85) {
                        grade = "Good";
                    } else {
                        grade = "Fair";
                    }
                    break;
                case 7:
                    grade = "Fair";
                    break;
                case 6:
                    grade = "Pass";
                    break;
                default:
                    grade = "Fail";
                    break;
            }

            System.out.println("The corresponding five - level grade is: " + grade);
        }

        scanner.close();
    }
}