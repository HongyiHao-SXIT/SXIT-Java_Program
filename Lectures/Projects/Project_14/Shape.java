package Project_14;

public abstract class Shape {
    protected String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract double getLength();
}    