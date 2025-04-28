package Lectures.Chapter.Chapter_2;
import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the base radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Please enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.printf("The volume of the cylinder is: %.2f", volume);

        scanner.close();
    }
}