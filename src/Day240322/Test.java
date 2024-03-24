package Day240322;

public class Test {
    public static void main(String[] args) {
        new A(new B());
    }
}

class A{
    public A(){
        System.out.println("A");

    }
    public A(B esay){
        this();
        System.out.println("AB");
    }
}
class B{
    public B(){
        System.out.println("B");
    }
}
