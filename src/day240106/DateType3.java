package day240106;

public class DateType3 {
    public static void main(String[] args) {
        byte byte1=8;
        int int1=188;
        //左边byte 右边是int
        //byte byte2=byte1+int1;
        int int2=byte1+int1;
        System.out.println(int2);
        //左边是long 右边int 左大右小
        long long1=byte1+int1;
        //左边是float 右边同字节
        float float1=byte1+int1;
        System.out.println(float1);
        short short1=111;
        double double1=short1+2;
        System.out.println(double1);
        //当字母char型与整形相加时，将字母转化成ASCII码
        char char1='a';
        int int3=10;
        int int4=int3+char1;
        System.out.println(int4);
        short short2=99;

        //需要将右边转化成char型
        //char char2=char1+short2;
        byte byte2=89;

        //需要将右边转成short型
        //short short3=byte2+short2;

        //左边是char 右边是int需转化成char
        //char char3=char1+byte2;
        //左short右int转short
        //short short4=byte2+byte1;
        //左float右double
        //float short5=int1+int2+2.2;


    }
}

