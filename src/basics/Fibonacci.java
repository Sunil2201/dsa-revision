package basics;

import java.sql.Array;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        System.out.println("The fibonacci sequence till " +num + " is:");
        for(int i=1; i<=num; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int n){
        if(n == 1){
            return 0;
        } else if(n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
