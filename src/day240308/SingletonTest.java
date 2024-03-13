package day240308;

public class SingletonTest {
    public static void main(String[] args) {

       Singleton S  = Singleton.getInstance();
        System.out.println(S);
        Singleton S1  = Singleton.getInstance();
        System.out.println(S1);
        Singleton1 S2=Singleton1.getinstance();
        Singleton1 S3=Singleton1.getinstance();
        System.out.println(S2);
        System.out.println(S3);


    }
}