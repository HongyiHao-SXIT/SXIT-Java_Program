package Lectures.Chapter.Chapter_3;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            num = Math.abs(num);
            int digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            System.out.println("The sum of the digits of the number is: " + digitSum);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
}    