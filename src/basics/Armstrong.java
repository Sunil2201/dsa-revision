package basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = input.nextInt();
        System.out.println(armstrong(num));
    }

    static boolean armstrong(int num){
        if(num == 0 || num == 1){
            return true;
        }
        else{
            int originalNum = num;
            int sum = 0;
            while(num != 0){
                int digit = num%10;
                sum += Math.pow(digit, 3);
                num = num/10;
            }
            return sum == originalNum;
        }
    }
}
