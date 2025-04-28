package Lectures.Chapter.Chapter_5;

import java.util.Scanner;

public class FindThemin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.println("Please enter 5 double numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double minimum = min(numbers);

        System.out.println("The minimum value in the array is: " + minimum);

        scanner.close();
    }

    public static double min(double[] array) {
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}    