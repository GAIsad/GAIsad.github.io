package day240222;

public class DogTest {
    public static void main(String[] args) {
        Dog dog=new Dog();
        //dog.ID=1;
        dog.setID(1);
        dog.name="小白";
        dog.color="white";

        dog.show("吃饭睡觉");
        System.out.println(dog.getID());
        Dog dog1=new Dog();
        dog1.setID(2);
        dog1.name="小黑";
        dog1.color="black";

        dog1.show("洗澡玩球");
    }
}
