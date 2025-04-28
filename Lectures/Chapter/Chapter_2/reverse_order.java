package Lectures.Chapter.Chapter_2;

import java.util.Scanner;

public class reverse_order {
    public static void main(String[] args) {
        int tens, unit, number;
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);

        number = input.nextInt();
        tens = number / 10;
        unit = number % 10;


    System.out.println("The reverse order of this number is: " + (unit * 10 + tens));
    }
}
