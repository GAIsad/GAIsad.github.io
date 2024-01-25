package day240106;

public class Netogite {
    public static void main(String[] args) {
        //数据类型 变量名=变量值
        int count=2;
        System.out.println("count="+ count);

        int age;
        //变量需要初始化

//      //System.out.println(age);

        age=4;
        System.out.println("age="+age);
        //同一个类别的变量名唯一
        //age已经被定义过了，无法再次定义，但可以对age的值进行修改
        //int age=22;
        age=22;
        System.out.println("age="+age);

    }

    public static void m(String[] args) {
        //一类别无法引用另一类的变量(可以用主类与派生类来区别）
        //System.out.println("age"+age);


    }
}
