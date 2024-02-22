package day240200_winter_holiday_homework;

/*
排序算法 将一串数组（一个列表）中的元素（整数，数字，字符串等）按某种顺序（增大，减小，字典顺序等）重新排列。 sorting
冒泡排序 排序算法之一 它比较两个相邻的元素，并决定是否交换它们，直到它们按预期顺序排列 像水中气泡上升到表面的运动过程一样
Given an array of N elements, Bubble Sort will:
1. Compare a pair of adjacent items (a, b),
2. Swap that pair if the items are out of order (in this case, when a > b),
 3. Repeat Step 1 and 2 until we reach the end of array
 (the last pair is the (N-2)-th and (N-1)-th items as we use 0-based indexing),
4. By now, the largest item will be at the last position. We then reduce N by 1 and repeat Step 1 until we have N = 1.
 */
public class BubbleSor_two {
    public static void main(String[] args) {
        int[] arr = new int[]{28, 2, 5, 9, 11};
        System.out.print("排序之前：");
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 交换 定义temp(0-1,1-2,2-3)交换
        // temp = arr[j + 1];
        //  arr[j + 1] = arr[j];
        //  arr[j] = temp;
        //第二轮：index 0~1，1~2，2~3 ，依次比较，（循环）第二大的数在倒二个，3~4不用再次比较
        //多轮下去，不断将大的数放在后面，这时我们应该使用循环的嵌套，双重循环来进行，每轮重复内容

    }
}
