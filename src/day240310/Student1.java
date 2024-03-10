package day240310;

public class Student1 {
    // state
    String name;
    private static final Student1 instance = new Student1();


    private Student1() {
        System.out.println("----");

    }
    //static
    public static Student1 getInstance(){
        return instance;
    }
}
