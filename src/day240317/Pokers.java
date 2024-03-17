package day240317;

public class Pokers {
    String number1;
    String color1;
    public static String[] color={"梅花", "黑桃", "方片","红桃"};
    public static String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public void getPoker(){
        for (int i = 0; i <=3; i++) {
            System.out.println();
            for (int j = 0; j <=12; j++) {
                System.out.print(color[i]+number[j]+" ");
            }
        }
    }
}


