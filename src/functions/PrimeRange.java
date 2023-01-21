package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower bound: ");
        int num1 = input.nextInt();
        System.out.println("Enter the upper bound: ");
        int num2 = input.nextInt();
        findPrimes(num1, num2);
    }

    static void findPrimes(int num1, int num2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = num1; i <= num2; i++){
            int c = 2;
            int flag = 0;
            while(c < Math.sqrt(i)){
                if(i%c == 0) {
                  flag = 0;
                  break;
                }
                c += 1;
            }
            if(c > Math.sqrt(i)){
                flag = 1;
            }
            if(flag == 1 && i != 1){
                list.add(i);
            }
        }
        System.out.println("The list of primes is: " +list);
    }

}
