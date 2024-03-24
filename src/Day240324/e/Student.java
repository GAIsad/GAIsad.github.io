package Day240324.e;

public class Student extends Person{
    public Student(String name) {
    super(name);
    }

    @Override
    public void describeLonely(String text) {

        System.out.println(text);//想到提参数
    }
}
