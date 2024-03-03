package day240303.e1;

import day240303.e1.Student;

public class StudentTest {
    //TODO  二个student类
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = "1001";
        student1.name = "李明";
        student1.age = "18";
        System.out.println("学生（学号" + student1.id + "）的信息：学号=" + student1.id + "、姓名=" + student1.name + "、年龄=" + student1.age);
        Student student2 = new Student();
        student2.id = "1002";
        student2.name = "小红";
        student2.age = "19";
        System.out.println("学生（学号" + student2.id + "）的信息：学号=" + student2.id + "、姓名=" + student2.name + "、年龄=" + student2.age);

    }

}
