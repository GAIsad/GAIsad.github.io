package Day240324.Test2;

public class Test4 {
    public static void main(String[] args) {
        Person p1 = new Student();
        // 不能直接调用子类特有的结构
//        p1.study();
//        System.out.println(p1.school);

        // 向下转型，强转符。
        Student s1 = (Student) p1;
        s1.study();
        System.out.println(s1.school);

        System.out.println(p1 == s1);

        /*
        向下转型可能会出现：类型转换异常（java.lang.ClassCastException）
         */
        Person p2 = new Teacher();
        Student s2 = (Student) p2;
        s2.study();
    }
}
