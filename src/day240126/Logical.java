package day240126;

public class Logical {
    public static void main(String[] args) {
        boolean b1=true;
        b1=false;
        int num1=10;
        if(b1 & num1++>0){
            System.out.println("厦门");
        }else{
            System.out.println("莆田");
        }
        System.out.println("num="+num1);



        boolean b2=true;
        int num2=10;
        if(b2 && (num2++>0)){
            System.out.println("厦门");
        }else{
            System.out.println("莆田");
        }
        System.out.println("num2="+num2);



        boolean b3=false;
        b3=true;
        int num3=10;
        if(b3 | (num3++>0)){
            System.out.println("厦门");
        }else{
            System.out.println("莆田");
        }
        System.out.println("num3="+num3);



        boolean b4=false;
        b4=true;
        int num4=10;
        if(b4 || (num4++>0)){
            System.out.println("厦门");
        }else{
            System.out.println("莆田");
        }
        System.out.println("num4="+num4);
    }
}
