package day240315;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int factorial = 1;
        System.out.println("输入一个数");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(n);
        for (int i = 1; i <=n ; i++) {
            factorial*=i;
            System.out.println(factorial);
        }

    }
}
