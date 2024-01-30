package day240125;

public class If {
    public static void main(String[] args) {

        int x=8;
        int y=9;
        int i= x >= y ? x : y;
        System.out.println("两者较大的数"+i);
        if(x>y){
            System.out.println(x);
        }
            else{
                System.out.println(y);
            }

    }
}
