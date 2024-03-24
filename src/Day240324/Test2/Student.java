package Day240324.Test2;

public class Student extends Person{
    String school;

    @Override
    void eat() {
        System.out.println("Student.eat");
    }

    @Override
    void play() {
        System.out.println("Student.play");
    }

    void study() {
        System.out.println("Student.study");
    }
}
