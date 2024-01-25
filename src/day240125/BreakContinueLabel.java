package day240125;

public class BreakContinueLabel {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("===  === ===");
        for(int i=1;i<=5;i++){
            if(i==4){
                System.out.print(" ");
            }
            else
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("===  === ===");
        //多重循环 break,跳转break之外
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {
                if (i == 4) {
                    break;
                }
                System.out.print(i + " ");
            }
            System.out.print(",");}
        //
            System.out.println();
            System.out.println("===  === ===");
        label: for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {
                if (i == 4) {
                    // continue label;
                    break label;
                }
                System.out.print(i + " ");
            }
            System.out.print(",");
        }

    }
}
