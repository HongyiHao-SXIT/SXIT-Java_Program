package Lectures.Chapter.Chapter_4;

import java.util.Scanner;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            throw new IllegalArgumentException("The equation has no real roots.");
        } else if (a == 0) {
            throw new IllegalArgumentException("a cannot be zero.");
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            throw new IllegalArgumentException("The equation has no real roots.");
        } else if (a == 0) {
            throw new IllegalArgumentException("a cannot be zero.");
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the value of a:");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double a = input.nextDouble();

        System.out.println("Please enter the value of b:");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double b = input.nextDouble();

        System.out.println("Please enter the value of c:");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        try {
            System.out.println("Root 1: " + equation.getRoot1());
            System.out.println("Root 2: " + equation.getRoot2());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}