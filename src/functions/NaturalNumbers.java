package functions;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = input.nextInt();
        System.out.println("The output of first " + n + " natural numbers is:" + getSum(n));
    }
    static int getSum(int n){
        int sum = 0;
       for (int i=1; i<=n; i++){
        sum += i;
       }
       return sum;
    }
}
