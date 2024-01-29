package day240129;

public class ArrayPhone {
    public static void main(String[] args) {


        int[] array1 = new int[]{8, 2, 1, 0, 3};
        int[] array2 = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String b="";
        for (int m=0; m<array2.length; m++){
            int i;
            i=array2[m];
            b+=array1[i];
        }
        System.out.println(b);
    }
//18013820100
}