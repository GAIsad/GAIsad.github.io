package day240125;

public class SwitchNumber {
    public static void main(String[] args) {
        int x=9;
        int y=8;
        //第三者帮助交换
        int z;
        //交换过程
        z=x;
        x=y;
        y=z;
        //注意解决问题的思想
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
