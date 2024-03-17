package day240317;

public class Pokers {
    public static String[] color = {"梅花", "黑桃", "方片","红桃"};
    public static String[] number={"1","2","3","4","5","6","7","8","9","10","j","q","k"};
    void getPoker(){
        for (int i = 0; i <=color.length-1; i++) {
            System.out.println();
            for (int j = 0; j <= number.length-1; j++) {
                System.out.print(color[i]+number[j]+" ");
            }
        }
    }
}


