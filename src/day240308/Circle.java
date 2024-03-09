package day240308;

public class Circle {
    double radius;

public  Circle(double radius){
    this.radius=radius;
    System.out.println("this="+this);
}
 public double area(){
return this.radius*radius*3.14;
}
}

