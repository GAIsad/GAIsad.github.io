package day240106;

public class DateType {
    public static void main(String[] args) {


        //整形
    /*
    1.byte 8-bit 1字节 -128~127
    2.short 16-bit 2字节
    3.int 32-bit 4字节
    4.long 64-bit 8字节 超出范围后跟L
     */
        byte from = -128;
        byte to = 127;
        short a = 110;
        int c= 1234;
        long d=232433434332L;
        System.out.println("form="+from);
        System.out.println("to="+to);
        System.out.println("d="+d);
        System.out.println("a="+a);
        System.out.println("c="+c);
        /*
        2.浮点型
        2（1）float 4字节需要跟F/f
        （2）double 8字节
         */
        float e= 18.8F;
        double f=21.2;
        System.out.println("e="+e);
        System.out.println("f="+f);
        //3 char 字符型 2字节
        //char后只能跟一个字符，可以是字母也可以是中文，也可以是特定的符号
        char c1='a';
        char c2='B';
        char c3='男';
        char c4='\n';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.print("Hello"+c4);
        System.out.println("World");
        //4 boolen 布尔型 1字节
        boolean g=true;
        if(g){
            System.out.println("恭喜你，自由了");
        } else
        {
            System.out.println("接着苦命");
        }

    }
}
