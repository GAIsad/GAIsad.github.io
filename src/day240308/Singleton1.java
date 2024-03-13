package day240308;

public class Singleton1 {
    int age;
    private static Singleton1 instance=null;
    private Singleton1(){
    }
    //behavior
    public static Singleton1 getinstance(){
        if(instance==null){
            Singleton1 instance=new Singleton1();

        }
        return instance;
    }
}
