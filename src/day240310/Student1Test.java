package day240310;

public class Student1Test {
    public static void main(String[] args) {

        Student1 student =Student1.instance;

        //Student1 student1=new Student1();
        Student1.instance=null;
        Student1 student2 =Student1.instance;
        System.out.println(student);
        System.out.println(student2);
    }
}