package Lectures.Chapter.Chapter_3;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();
        int sum = calculateDigitSum(number);
        System.out.println("The sum of the digits of this number is: " + sum);
        scanner.close();
    }

    public static int calculateDigitSum(int num) {
        num = Math.abs(num);
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}