package day240317;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        Person P=new Person();
        System.out.println(P.getClass().getSuperclass());
        Student student=new Student();
        System.out.println(student.getClass().getSuperclass());
        student.eat();


    }


}
