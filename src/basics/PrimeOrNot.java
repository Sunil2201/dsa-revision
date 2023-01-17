package basics;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = in.nextInt();
        if(n <= 1){
            System.out.println("Neither prime nor composite");
        }
        int c = 2;
        if(n == 4){
            System.out.println("Not prime");
        }
        else{
            while(c < Math.sqrt(n)){
                if(n%c == 0){
                    System.out.println("Not prime");
                    return;
                }
                c = c+1;
            }
            if (c > Math.sqrt(n)){
                System.out.println("Prime");
            }
        }
    }
}
