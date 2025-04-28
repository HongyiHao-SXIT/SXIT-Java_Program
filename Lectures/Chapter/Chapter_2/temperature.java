package Lectures.Chapter.Chapter_2;
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        double fa_degree, celsius = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Fahrenheit degree: ");

        fa_degree = input.nextDouble();

        celsius = (5.0 / 9) * (fa_degree - 32);

        System.out.println("Celsius is: " + celsius);

        input.close();
    }
}