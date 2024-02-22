package day240131;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {28, 5, 11, 9, 2};
        //流程说明：
        /*
        1.关于循环过程
        第一轮：index 0~1比较，大者在后，之后1~2，2~3，3~4 依次比较（这是一个循环）循环结果是最大的数在最后一个
        第二轮：index 0~！，1~2，2~3 ，依次比较，（循环）第二大的数在倒二个，3~4不用再次比较
        多轮下去，不断将大的数放在后面，这时我们应该使用循环的嵌套，双重循环来进行，每轮重复内容
        这是大循环的流程原因与来源
        第一轮（循环4次）：0~5依次交换 for (int j = 0; j < 5-1; j++) {
                if (arr[j] > arr[j + 1]) {
                //交换过程
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                       arr[j] = temp;}
         第二轮（循环3次）for (int j = 0; j < arr.length-2; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;}
          第i轮（循环5-i次）for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;}
         */
        int temp = 0;
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
