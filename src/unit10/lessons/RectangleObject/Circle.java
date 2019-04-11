package unit10.lessons.RectangleObject;

public class Circle extends Shape{
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        super("Circle");
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void translate(double dx, double dy){
        center.translate(dx, dy);
    }

    public String toString() {
        return super.toString() + ": " + center + "; Radius: " + radius;
    }
}
