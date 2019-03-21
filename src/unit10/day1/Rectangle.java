package unit10.day1;

public class Rectangle {
    public Point p1, p2;

    public Rectangle(Point pt1, Point pt2){
        p1 = pt1;
        p2 = pt2;
    }
    public double getWidth(){
        return Math.abs(p1.x - p2.x);
    }
    public double getHeight(){
        return Math.abs(p1.y - p2.y);
    }
    public double getArea(){
        return getHeight() * getWidth();
    }
    public double getPerimeter(){
        return 2 * (getWidth() + getHeight());
    }
    public void translate(double dx, double dy){
        p1.translate(dx, dy);
        p2.translate(dx, dy);
    }
}
