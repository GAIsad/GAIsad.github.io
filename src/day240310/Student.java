package day240310;

public class Student {
    private static  Student instance;
    private Student(){

    }
    public static Student getInstance(){
            if(instance==null) {
                instance = new Student();

            }

        return instance;
    }
}
