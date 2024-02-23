package day240222;

public class Circle {
    //state
    private static double pi=3.14;
      double radius;
    public Circle(double radius){
        // IDEA 编辑器自动生成的版本
        this.radius=radius;
    }
    //behavior


    public double area(){
        return pi*radius*radius;
    }
}
