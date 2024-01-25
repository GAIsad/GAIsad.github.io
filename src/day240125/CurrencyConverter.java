package day240125;


import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        int count=0;
        while(true){
            System.out.println("请输入美元金额");
            //获得用户的输入
            Scanner scanner = new Scanner(System.in);
            //类型储存
            Double next = scanner.nextDouble();


            double a = 7.1522;

            double b = a * next;

            System.out.println("当前汇率:1美元约等于" + a + "人民币");
            System.out.println("按照当前汇率转换出的人民币" + b);
            count++;
            if(count>=4){
                break;
            }
        }
    }
}
