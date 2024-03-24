package Day240324.Test1;

public class Person {
    //state
    String name;

    //constructor
    public Person(String name) {
        this.name = name;
    }
    //behavior
    public void adopt(Animal animal){
        if(animal instanceof Dog){
            System.out.println("你是狗");
        }
        System.out.println(this.name+"养了一只"+animal.name);
    }
}