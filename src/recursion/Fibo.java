package recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}