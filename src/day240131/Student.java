package day240131;

public class Student {
    public static String country="中国";//常量
    //state 储存-> fields 里层
    String name;
    char sex;
    String hairstyle;
    int age;
    //behavior 暴露通过方法(最基础的main方法）外层
    void study(){
        System.out.println("我会学习");
    }

    public static void main(String[] args) {
        System.out.println("我会学习");
    }
}
