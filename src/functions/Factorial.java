package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Factorial of " +n+ " is: " +factorial(n));
    }
    static int factorial(int n){
        if(n == 1 || n== 0){
            return 1;
        }
        int factorial = 1;
        for(int i=n; i>0; i--){
            factorial *= i;
        }
        return factorial;
    }
}
