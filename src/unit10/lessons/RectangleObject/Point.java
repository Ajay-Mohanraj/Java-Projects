package unit10.lessons.RectangleObject;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public void translate(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }
    public void dilate(double factor){
        this.x *= factor;
        this.y *= factor;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
