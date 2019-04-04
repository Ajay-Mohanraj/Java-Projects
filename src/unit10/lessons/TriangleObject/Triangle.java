package unit10.lessons.TriangleObject;

public class Triangle {
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public Triangle(double s){
        this.s1 = s;
        this.s2 = s;
        this.s3 = s;
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }
    public boolean isScalene(){
        return (s1 != s2 && s1 != s3 && s2 != s3);
    }
    public boolean isIsosceles(){
        return (s1 == s2 || s1 == s2 || s2 == s3);
    }
    public double getPerimeter(){
        return (s1 + s2 + s3);
    }
    public void dilate(double factor){
        s1 *= factor;
        s2 *= factor;
        s3 *= factor;
    }
    public boolean isCongruent(Triangle Triangle){
        return (Triangle.s1 == s1 && Triangle.s2 == s2 && Triangle.s3 == s3);
    }
    public String toString(){
        String a = String.format("Triangle\n\tSide 1: %.2f\n\tSide 2: %.2f\n\tSide 3: %.2f", s1, s2, s3);
        return a;
    }
}
