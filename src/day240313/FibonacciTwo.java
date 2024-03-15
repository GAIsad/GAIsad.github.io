package day240313;

public class FibonacciTwo {
    public int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }
}
