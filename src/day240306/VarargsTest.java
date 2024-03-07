package day240306;

public class VarargsTest {
    public  static int add(int...a){

        return 0;
    }


    public static void main(String[] args) {
        System.out.println(add(1));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,9));
    }
}