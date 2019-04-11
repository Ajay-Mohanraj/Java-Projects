package unit10.lessons.RectangleObject;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void translate(double dx, double dy);

    public String toString() {
        return name + " (" + super.toString() + ")";
    }
}
