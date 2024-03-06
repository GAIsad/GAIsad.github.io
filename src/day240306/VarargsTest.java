package day240306;

public class VarargsTest {
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarargsTest adder = new VarargsTest();
        int[] numbers = {1, 2, 3, 4, 5};  // 你要相加的数字数组
        int sum = adder.add(numbers);
        System.out.println("数组的和是：" + sum);
    }
}