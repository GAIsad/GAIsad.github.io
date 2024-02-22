package day240222;

public class Dog {
    //state
    String ID;
    String color;
    String name;
    //behavior
    void show(String behavior){
        System.out.println(ID+"\n"+name+"\n"+color);
        System.out.println("小狗在"+behavior);
    }
}
