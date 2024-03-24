package Day240324.Test2;

public class Test2 {
    public static void main(String[] args) {
        /*
        polymorphism
         */
        Person p1 = new Student();
        p1.eat();
        // Q:
        /*
        command|control + click, go to where?
         */

        Person p2 = new Teacher();
        p2.eat();
    }
}
