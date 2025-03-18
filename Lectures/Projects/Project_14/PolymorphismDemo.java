package Project_14;

public class PolymorphismDemo {
    public static double sumArea(Shape[] shapes) {
        double sumArea = 0.0;
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            sumArea = sumArea + shape.getArea();
        }
        return sumArea;
    }

    public static void main(String[] args) {
        double d;
        Shape[] shapes = new Shape[5];
        for (int i = 0; i < shapes.length; i++) {
            d = Math.random();
            if (d > 0.5) {
                shapes[i] = new Circle(1);
            } else {
                shapes[i] = new Rectangle(1, 2);
            }
        }
        double totalArea = sumArea(shapes);
        System.out.printf("The total area of the shapes is = %.2f", totalArea);
    }
}    