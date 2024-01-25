package day240125;

import java.util.Random;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        while(true){
            System.out.println("请输入美元金额");
            //获得用户的输入
            Scanner scanner = new Scanner(System.in);
            Double next = scanner.nextDouble();
            System.out.println("请输入美元金额" + next);

            double a = 7.1522;

            double b = a * next;

            System.out.println("当前美元汇率:1美元约等于" + a + "人民币");
            System.out.println("按照当前汇率转换出的人民币" + b);
        }
    }
}
