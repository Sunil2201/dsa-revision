package basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter the operator");
            char op = input.next().charAt(0);
            if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Enter two numbers:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                calculation(op, num1, num2, ans);
            }
        }
    }
    static void calculation(char op, int num1, int num2, int ans){
        switch (op){
            case '+':
                ans = num1 + num2;
                System.out.println(ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(ans);
                break;
            case '/':
                if(num2 != 0){
                    ans = num1/num2;
                    System.out.println(ans);
                }else{
                    System.out.println("Second no should be greater than 0");
                }
                break;
            case '*':
                ans = num1 * num2;
                System.out.println(ans);
                break;
            case '%':
                ans = num1 % num2;
                System.out.println(ans);
                break;
            default:
                System.out.println("Invalid operator!!");
        }
    }
}
