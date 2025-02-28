package Lectures.Chapter.Chapter_2;

import java.util.Scanner;

public class compute_polynomial {
    public static void main(String[] args) {
    double a, b, c, delta, x;
    Scanner input = new Scanner(System.in);
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
    delta = b * b - 4 * a * c;
    x = (-b + Math.sqrt(delta)) / (2 * a);

    System.out.println("The value of x is: " + x);
    }
}