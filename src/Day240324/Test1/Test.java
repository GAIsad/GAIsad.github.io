package Day240324.Test1;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("小张");
        Cat cat=new Cat("浩浩");
        Dog dog=new Dog("小白");
        person.adopt(cat);
        person.adopt(dog);
    }
}
