package day240306;

public class Student {
    int id;
    String name;
    int age;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Student(int id, String name, int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
