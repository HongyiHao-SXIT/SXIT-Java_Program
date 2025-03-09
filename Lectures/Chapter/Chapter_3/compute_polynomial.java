package Lectures.Chapter.Chapter_3;

import java.util.Scanner;

public class compute_polynomial {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the coefficient a (a should not be 0):");
            a = input.nextDouble();
        } while (a == 0);

        System.out.println("Please enter the coefficient b:");
        b = input.nextDouble();
        System.out.println("Please enter the coefficient c:");
        c = input.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The two real roots of the quadratic equation are: " + x1 + " and " + x2);
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            System.out.println("The quadratic equation has a double root: " + x);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("The quadratic equation has two complex roots:");
            System.out.println(realPart + " + " + imaginaryPart + "i");
            System.out.println(realPart + " - " + imaginaryPart + "i");
        }
        input.close();
    }
}