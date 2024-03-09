package day240308;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        System.out.println("circle="+circle);
        System.out.println(circle.area());
        System.out.println("=== === ===");
        Circle circle2=new Circle(5);
        System.out.println("circle2="+circle2);
        System.out.println(circle.area());
    }
}
