package day240130;

public class ArrayFind {
    public static void main(String[] args) {
        //数据的样子
        //什么数据类型储存
        int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
        int traget = 20;
        int m=0;
        //操作
        /*
        重复内容
        int a1=arr[0];
        判断：if(traget==arr[0]){
            System.out.println("在数组第"+i+"位找到了20");
            循环arr[0].arr[1]arr[2]arr[3];//应该使用循环
         */
        //将整个数组的值与targer进行比对，加以if判断，如果找到对应的值则进行输出
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == traget) {
                m++;
                System.out.println("在数组第"+i+"位找到了20");
                break;
            }
        }
        //添加一个判断，寻找是否有没有找到对应的数，即找到与没找到事两种状态（boolean型）是表示两种状态的方便数据类型；
        if(m!=1){
            System.out.println("没有找到"+traget);
        }
    }
}
