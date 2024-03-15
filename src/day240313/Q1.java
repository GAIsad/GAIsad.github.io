package day240313;

public class Q1 {
    public static int x = 7;
    public int y = 5;


    public static void main(String[] args) {
        Q1 a=new Q1();
        Q1 b=new Q1();
        a.x=2;
        a.y=5;
        b.x=3;
        b.y=4;
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(b.x);
        System.out.println(b.y);
        System.out.println(Q1.x);
    }
}