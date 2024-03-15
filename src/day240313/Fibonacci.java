package day240313;

public class Fibonacci {
//传统数列加上类完成的写法
     public static int Fibonacci(int n){
       if(n<=1){
           return 0;
       }
       int[] Fibonacci=new int[n+1];
       Fibonacci[0]=1;
       Fibonacci[1]=1;
        for (int i = 2; i <=n; i++) {
            Fibonacci[i]=Fibonacci[i-1]+Fibonacci[i-2];

        }
       return  Fibonacci[n-1];
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }

    /*public static long fibonacci(int n) {
        if (n <= 1) {
            return 0;
        }
        int[] fib = new int[n + 1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {

            System.out.print(fibonacci(5) );

        System.out.println();
    */}


