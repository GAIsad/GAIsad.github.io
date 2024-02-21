package day240200_winter_holiday_homework;

/**
 * 问题描述：
 * 已知 array1 和 array2
 * <p>
 * 要求：
 * 输出隐藏数组中的电话号码
 */
public class DisplayPhoneNumber {
    public static void main(String[] args) {
        // 数据
        int[] array1 = new int[]{8, 2, 1, 0, 3};
        int[] array2 = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};

        // 思考过程
        // 求的是电话号码，先不管这两个数组，正常的电话号码长什么样？
        // 至少我们知道，国内电话号码（手机号码）正常是 11 位
        // array1 和 array2 跟 11 位有没说明关联？
        // array2 的长度正好是 11 位
        // 正常的手机号码是 1 开头的，直接输入 array2 好像不对劲
        // 那题干中正好还有一个 array1 没用上，结合其他看看
        // 结合数组的知识，好像一个是索引、一个是数值
        // === === ===
        // 写代码
        // 如何获取代码的长度？数组.length
        // 再结合循环的知识，把 array2 循环出来，同时假设每个数值都是 1，先利用 array2 输出 11 个 1
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array1[array2[i]]);
        }
    }
}
