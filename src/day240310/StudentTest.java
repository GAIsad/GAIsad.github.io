package day240310;



public class StudentTest {
    public static void main(String[] args) {


        //思考-->外部不能new那就在类里面来new
        //Student s=new Student();
        Student s = Student.singleton();
        Student s1 = Student.singleton();
        System.out.println(s);
        System.out.println(s1);
    }
}