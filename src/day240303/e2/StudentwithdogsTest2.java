package day240303.e2;



public class StudentwithdogsTest2 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.id =12;
        dog1.name="小黑";
        dog1.color="black";
        Dog dog2 = new Dog();
        dog2.id =12;
        dog2.name="小白";
        dog2.color="white";
        Dog dog3 = new Dog();
        dog3.id =12;
        dog3.name="小红";
        dog3.color="red";

        Studentwithdogs studentwithdogs1 = new Studentwithdogs();
        studentwithdogs1.id = "202321396113";
        studentwithdogs1.name = "哈多啦";
        studentwithdogs1.age = "18";
        studentwithdogs1.dogs = "1";
        studentwithdogs1.show();
        dog1.show();
        Studentwithdogs studentwithdogs2 = new Studentwithdogs();
        studentwithdogs2.id = "202321396114";
        studentwithdogs2.age = "18";
        studentwithdogs2.name = "笋子";
        studentwithdogs2.dogs = "2";
        studentwithdogs2.show();
        dog2.show();
        dog3.show();
    }
}