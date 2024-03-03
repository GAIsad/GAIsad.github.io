package day240303.e3;

public class t {
    public double sum(double a, double b) {//形参
        return (a + b);
    }


    public static void main(String[] args) {
        t calculator = new t(); // 创建Calculator类的实例
        double sum = calculator.sum(10, 20); // 实参
        System.out.println("两数之和是：" + sum);
    }
}