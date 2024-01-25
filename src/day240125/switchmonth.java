package day240125;
import java.util.Scanner;
public class switchmonth {

    public static void main(String[] args) {
        int m=0;
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

            switch (month) {
                case 1:
                    System.out.println("这个月有31天");
                    break;
                case 3:
                    System.out.println("这个月有31天");
                    break;
                case 5:
                    System.out.println("这个月有31天");
                    break;
                case 7:
                    System.out.println("这个月有31天");
                    break;
                case 8:
                    System.out.println("这个月有31天");
                    break;
                case 10:
                    System.out.println("这个月有31天");
                    break;
                case 12:
                    System.out.println("这个月有31天");
                    break;
                case 4:
                    System.out.println("这个月有 30天");
                    break;
                case 6:
                    System.out.println("这个月有 30天");
                    break;
                case 9:
                    System.out.println("这个月有 30天");
                    break;
                case 11:
                    System.out.println("这个月有 30天");
                    break;
                case 2:
                    System.out.println("这个月有29天");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + month);

            }


        }
}
