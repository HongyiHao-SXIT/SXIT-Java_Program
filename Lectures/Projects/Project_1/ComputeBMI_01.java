package Project_1;
import java.util.Scanner;

public class ComputeBMI_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the BMI Calculator");
        System.out.print("Please enter your weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Please enter your height (m): ");
        double height = input.nextDouble();
        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Interpretation of BMI results:");
        interpretBMI(bmi);
        input.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void interpretBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 24) {
            System.out.println("Your weight is normal.");
        } else if (bmi < 28) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}    