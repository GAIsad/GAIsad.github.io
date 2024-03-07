package day240306;

public class OverloadTest2 {
    public static char add(char a,char b){
        System.out.println(a+""+b);
        return a;
    }
    /*
    private static int add(int a,int b){
     return a+b;
     }
     */
    public static int add(int a,int b){
        return a+b;
    }
    public  static  double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        double m=5.2323;
        System.out.println();
        System.out.println(add(1,2));
        System.out.println((add(1.4,2.4)));
        System.out.println(add('2','1'));//ASCII码
    }
}
