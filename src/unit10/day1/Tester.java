package unit10.day1;

public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(1, 6);

        Rectangle r = new Rectangle(p1, p2);

        System.out.println(r);
    }
}
