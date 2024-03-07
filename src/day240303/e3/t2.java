package day240303.e3;

public class t2 {
    //overload
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{1,23,3};
        System.out.println(arr1);
        //输出地址
        char[] arr2=new char[]{'a','b','c','d','e'};
        System.out.println(arr2);
        //输出数组
        boolean[] arr3=new boolean[]{false,true,true};
        System.out.println(arr3);
        //输出地址
        String[] arr4=new String[]{"aad","aaad"};
        System.out.println(arr4);

    }
}
