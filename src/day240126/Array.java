package day240126;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] day=new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        System.out.println(day[(m-1)]);
    }
}
