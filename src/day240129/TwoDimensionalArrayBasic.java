package day240129;

public class TwoDimensionalArrayBasic {
    public static void main(String[] args) {

        String[][] arr2;
        arr2 = new String[3][4];
        int[][] arr=new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        System.out.println(arr[0]);
        /*int[][] arr1=new int[3][];
        System.out.println(arr1[0]);
        System.out.println(arr1[0][2]);
        输出null和报错*/
         /*int[][] arr1=new int[3][2];
        System.out.println(arr1[0]);
          输出地址*/
        int[][] arr1=new int[4][];
        arr1[1]=new int[5];
        arr1[1][1]=1;
        //声明合理
        //arr1[2][2]=1;没有初始化，没有对arr1[2]进行定义
        //System.out.println(arr1[2][2]);

    }
}