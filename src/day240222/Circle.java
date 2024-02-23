package day240222;

public class Circle {
    //state
   double radius;
    public Circle(double r){
        radius=r;
    }
    //behavior


    public double area(){
        return 3.14*radius*radius;
    }
}
