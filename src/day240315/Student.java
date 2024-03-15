package day240315;

public class Student {
    //state
    String name="初始值";
    int age=8;
    static String id;
    //instance block
    //Initalizing 实例
    {
        name="123";
        age=17;
        System.out.println("...");
    }
    //static 属于类 专门初始class variable类变量
    static{
        id="123";
    }
    //behavior
}
