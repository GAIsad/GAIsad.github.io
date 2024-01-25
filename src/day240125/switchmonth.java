package day240125;
import java.util.Scanner;
public class switchmonth {

    public static void main(String[] args) {
        int m=0;
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("这个月有31天");
                    break;
                case 4:
                case 6:
                case 9:
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
