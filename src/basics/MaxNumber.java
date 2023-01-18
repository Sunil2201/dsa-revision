package basics;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("The max of three numbers is: "+findMax(a,b,c));
    }

    static int findMax(int a, int b, int c){
        return Math.max(c, Math.max(a,b));
    }
}
