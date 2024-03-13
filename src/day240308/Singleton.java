package day240308;

public class Singleton {
    //state
    int age;
    private static  Singleton instance = new Singleton();
    private Singleton() {
    }
    //behavior
    public static Singleton getInstance(){

        return instance;
    }

}
