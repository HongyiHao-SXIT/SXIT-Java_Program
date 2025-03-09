package Lectures.Chapter.Chapter_3;

import java.util.Scanner;

public class check_number {
    public static void main(String[] args) {

        System.out.print("Please enter a positive number: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("You entered a positive number: " + number);

                if (number == (int) number) {
                    int intNumber = (int) number;
                    if (intNumber % 2 == 0) {
                        System.out.println(intNumber + " is an even number.");
                    } else {
                        System.out.println(intNumber + " is an odd number.");
                    }
                } else {
                    System.out.println("The positive number you entered is not an integer, so it can't be classified as odd or even.");
                }
            } else {
                System.out.println("The number you entered is not a positive number.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}