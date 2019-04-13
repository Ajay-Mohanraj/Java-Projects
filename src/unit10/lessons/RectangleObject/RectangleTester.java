package unit10.lessons.RectangleObject;

import org.w3c.dom.css.Rect;

public class RectangleTester {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(1, 6);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(p1, p2);
        shapes[1] = new Circle(new Point(7, 16), 3);
        shapes[2] = new Circle(p2, 7);

        for (Shape s : shapes) {
            System.out.println(s + "; Area = " + s.getArea());
            s.translate(3, 0);
            System.out.println(s + "; Area = " + s.getArea());
        }


    }
}
