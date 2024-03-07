package day240306;

public class StringConcat {
    public static String[] concat(String...a){
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i + 1]);
            if(i!=a.length-2){
                System.out.print(a[0]);
            }
        }
        return  a;
    }

    public static void main(String[] args) {
        concat("=","Hello","World","!");
        System.out.println();
        concat("-","Hello","World","!");
        System.out.println();
        concat(",","Hello","World","!");

    }
}
