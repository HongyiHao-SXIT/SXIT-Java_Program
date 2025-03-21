package Lectures.Chapter.Chapter_4;

class Rectangle {
    double height;
    double width;

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getParameter() {
        return 2 * (height + width);
    }

    public double getArea() {
        return width * height;
    }
}    