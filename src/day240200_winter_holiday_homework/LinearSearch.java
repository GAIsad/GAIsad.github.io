package day240200_winter_holiday_homework;

/**
 * 问题描述
 *   已知数组：int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
 *   求：查找20是否在上述数组中出现过？如果出现，输出对应的索引值；否则输出没有找到
 * <p>
 * 预期输出
 *   - 在index=**的位置上找到了**
 *   - 没有找到**
 */
public class LinearSearch {
    public static void main(String[] args) {
        // 数据
        int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
        int target = 20;
        int m0 = arr[0];
        if (target == m0) {
            System.out.println("在index=" + 0 + "的位置上找到了" + target);
        }

        int m1 = arr[1];
        if (target == m1) {
            System.out.println("在index=" + 1 + "的位置上找到了" + target);
        }

        //再次重复以上操作过于麻烦，思考优化
        //DRY原则
    }
}