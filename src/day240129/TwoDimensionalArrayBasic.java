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
        /*int[][] arr1=new int[4][];
        System.out.println(arr1[1]);（所有类型都一样是null）
        输出结果null
         */
         /*int[][] arr1=new int[4][3];
        System.out.println(arr1[1][2]);
        输出结果0，换成string则输出null，换成浮点则输出0.0，布尔型输出false即输出对应的基本单位
         */

        // arr1[1]=new int[5];
        //arr1[1][1]=1;
        //声明合理
        //arr1[2][2]=1;没有初始化，没有对arr1[2]进行定义
        //System.out.println(arr1[2][2]);

    }
}