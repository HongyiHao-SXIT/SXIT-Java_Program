package Project_14;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this(0.0);
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }

    @Override
    public double getLength() {
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }
}    