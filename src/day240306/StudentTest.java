package day240306;

public class StudentTest {
    public static void main(String[] args) {

        //为每个的新类提供不同的方法（overload的一种运用）
        Student student = new Student(1001, "李名", 18);
        Student student2=new Student();
        Student student3=new Student(1);
        Student student4=new Student(2,"dada");
    }
}
