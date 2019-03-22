package unit10.day1;

public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(1, 6);

        Rectangle r = new Rectangle(p1, p2);

        System.out.println(r);

        p1.translate(4, 3);


        System.out.println(r);
        r.translate(-1, 2);
        System.out.println(r);
        System.out.println(r.getPoint1());
        System.out.println(r.getPoint2());
        r.setPoint1(p1);
        System.out.println(r);
    }
}
