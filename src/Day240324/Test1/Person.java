package Day240324.Test1;

public class Person {
    //state
    String name;

    //constructor
    public Person(String name) {
        this.name = name;
    }
    //behavior
    public void adopt(Cat cat){
        System.out.println(this.name+"养了一只"+cat.name);
    }
    public void adopt(Dog dog){
        System.out.println(this.name+"养了一只"+dog.name);
    }
}