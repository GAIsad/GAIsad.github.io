package day240310;

public class Student {
    private Student(){

    }
    public static Student singleton(){
        Student s=new Student();
        return s;

    }
}
