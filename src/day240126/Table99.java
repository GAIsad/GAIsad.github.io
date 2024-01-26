package day240126;

public class Table99 {
    public static void main(String[] args) {
        int a;
        // step 1: 找到核心，要被重复执行的那些代码
        //System.out.println("1 * 1 = 1");


        // step 2: 核心的代码需要被重复执行 9 次
        /*for (int i = 1; i <= 9; i++) {
            System.out.println("1 * 1 = 1");
        }*/

        // step 3: 再还原出之前忽略的一个细节，第一个乘数，要动态化
        /*for (int i = 1; i <= 9; i++) { // 行
            System.out.println(i + " * 1 = 1");
        }*/

        // step 4, 5 , 6 ...: 还有细节要被还原出来，列，不能每行只有一列
        // 第一行：1列，第二行：2列，。。。，第九行：9列
        /*for (int i = 1; i <= 9; i++) { // 行
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + " * 1 = 1" + "  ");
            }
            System.out.println();
        }*/
        // step x: 再还原细节
        /*for (int i = 1; i <= 9; i++) { // 行
            for (int j = 1; j <= i ; j++) { // 列
                System.out.print(i + " * " + j + " = 1" + "  ");
            }
            System.out.println();
        }*/

        // step y: 再还原细节
        for(int i=1;i<=9;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                a=i*j;
                System.out.print(i+"*"+j+"="+a+" ");

            }
        }
    }
}
