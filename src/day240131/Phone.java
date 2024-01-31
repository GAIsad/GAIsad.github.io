package day240131;

public class Phone {
    //state（stores its state in fields)
    int size;
    String phonesort;
    String phonecolor;


    //behavior(expoeses its behavior through methods)
    void function1(String phoneNumber){//who?
        System.out.println("打电话给"+phoneNumber);
    }
    void function2(String time){
        System.out.println("看小说视频"+time);
    }


}
