package basics;

import java.util.Scanner;

public class CountingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter first number: ");
        int num2 = input.nextInt();
        System.out.println("No. of times num2 is present in num1 is: " +countNum(num1, num2));

    }
    static int countNum(int num1, int num2){
        if(num1 == 0){
            return 0;
        }
        int count = 0;
        while(num1 != 0){
            int digit = num1%10;
            if(digit == num2){
                count += 1;
            }
            num1 = num1/10;
        }
        return count;
    }
}
