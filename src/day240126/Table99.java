package day240126;

public class Table99 {
    public static void main(String[] args) {
        int a;

        for(int i=1;i<=9;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                a=i*j;
                System.out.print(i+"*"+j+"="+a+" ");

            }
        }
    }
}
