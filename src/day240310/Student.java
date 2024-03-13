package day240310;

public class Student {
    private static  Student instance;
    private Student(){

    }
    public static Student getInstance(){
        //main函数进入if创建类时形式固定
            if(instance==null) {
                instance = new Student();
            }

        return instance;
    }
}
