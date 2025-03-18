package Project_14;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle() {
        this(0.0, 0.0);
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) { 
        this.length = length;
    }

    @Override
    public double getLength() { 
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) { 
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "[Rectangle] length = " + length + ", width = " + width; 
    }
}