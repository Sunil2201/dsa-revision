package recursion;

public class Fibo {
    public static void main(String[] args) {
//        for(int i=0; i<=11; i++){
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

    static long fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
