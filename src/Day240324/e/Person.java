package Day240324.e;

public class Person {
    //state
    String name;
    public Person(String name) {
        this.name=name;
    }


    //behavior
    public void describeLonely(String text){
        System.out.println("   ");//可重写
    }

}
