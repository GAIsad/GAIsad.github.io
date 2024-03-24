package Day240324.Test2;

public class Test3 {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.eat();
        // Q：
        /*不能调用子类的变量state和behavior方法
        p1.school = "清华";
        p1.study();
         */
    }
}
