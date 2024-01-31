package day240131;

public class StudentTest {
    public static void main(String[] args) {
        //object
        Student student=new Student();
        student.name="小芳";
        student.sex='女';
        student.hairstyle="辫子粗又长";
        student.age=18;
        String name= student.name;
        System.out.println(name);
        System.out.println(student.country);
        student.study();//behavior的访问模式
    }
}
