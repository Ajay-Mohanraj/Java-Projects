package unit10.lessons.RectangleObject;

public class RectangleTester {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(1, 6);

        Rectangle r = new Rectangle(p1, p2);

        System.out.println(r);

        Circle c = new Circle(new Point(7, 16), 3);
        System.out.println(c);
    }
}
