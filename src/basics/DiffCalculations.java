package basics;

import java.util.Scanner;

public class DiffCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int negativeSum = 0;
        int evenSum = 0;
        int oddSum = 0;
        while(true){
            int num = input.nextInt();
            if(num == 0){
                break;
            }
            else if(num<0){
                negativeSum += num;
            }
            else if(num % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }
        }
        System.out.println("The sum of negative numbers is: " +negativeSum);
        System.out.println("The sum of positive even numbers is: " +evenSum);
        System.out.println("The sum of positive odd numbers is: " +oddSum);
    }
}
