package Lectures.Chapter.Chapter_4;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.height = 1;
        rectangle.width = 2;

        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getParameter());
    }
}    