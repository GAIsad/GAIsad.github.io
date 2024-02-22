package day240222;

import java.util.Scanner;

public class CirCleTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输出圆的半径");
        double r=scanner.nextDouble();
        Circle circle = new Circle();
        circle.R =r;
        circle.function1();
    }
}