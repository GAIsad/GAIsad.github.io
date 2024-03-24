package Day240324.e;

public abstract class Person {
    //state
    String name;

    public Person(String name) {
        this.name = name;
    }


    //behavior
    public abstract void describeLonely(String text);//抽象类对应抽象方法体

    public final void judgeXDD(String text) {
        System.out.println("ddd");
    }
}