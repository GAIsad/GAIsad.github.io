package day240126;

import java.util.Scanner;

public class Uth {
    public static void main(String[] args) {
        System.out.println("请输入一个大于100，小于999的数");
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int a,b,c;

        a=m/100;
        System.out.println("百位数是："+a);
        b=m%100/10;
        System.out.println("十位数是："+b);
        c=m%10;
        System.out.println("各位数是："+c);

    }
}
