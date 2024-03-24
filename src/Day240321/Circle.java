package Day240321;

public class Circle {
    public double radius;
    public Circle(){
        radius=1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return 3.14*radius*radius;
    }
}
