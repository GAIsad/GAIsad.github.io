package day240222;

public class Dog {
    //state
    private  int ID;
    String color;
    String name;
    //behavior
    public void setID(int dogID){
        ID=dogID;
        if(ID<0){
            System.out.println("输入错误");
        }
    }
    public String getID(){
        return "ID"+ID;
    }

    void show(String behavior){
        System.out.println(ID+"\n"+name+"\n"+color);
        System.out.println("小狗在"+behavior);
    }
}
