package Lectures.Chapter.Chapter_2;

import java.util.Scanner;

public class sum_number {
    public static void main(String[] args) {
        int num = 0, hundred, tens, ones, sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num = input.nextInt();

        hundred = num / 100;
        tens = (num / 10) % 10;
        ones = num % 10;

        sum = hundred + tens + ones;

        System.out.println("The sum of each digit is: " + sum);
        input.close();
    }
}