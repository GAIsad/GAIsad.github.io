package day240200_winter_holiday_homework;

/**
 * 问题描述
 * 已知数组：int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
 * 额外信息：数组元素是有顺序
 * 求：查找8是否在上述数组中出现过？如果出现，输出对应的索引值；否则输出没有找到
 * 额外要求：必须使用二分法查找，以便提升查找效率
 * <p>
 * 预期输出
 * - 在index=**的位置上找到了**
 * - 没有找到**
 */
public class BinarySearch {
    public static void main(String[] args) {
        // 数据（有序）
        int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        // 1. 定义两个变量 low（数组开始） 和 high（数组的终点），缩短数组长度 ，减少索引范围
        // 2. 初始：让 low = 0; high = arr.length -1 数组的长度
        // 3. 二分：定义middle = (low + high) / 2;缩短数组
        // 4. 判断： middle对应数组的值和target对比，有三种情况（等于、大于、小于）
        // 5. 根据三种不同情况改变 low 和 high 的值，寻找方法再次二分数组
        // 6. 什么时候停止二分？当 low <= high 的时候，循环结束
    }
}