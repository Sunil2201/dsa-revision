package basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.nextLine();
        System.out.println(palindrome(word));
    }

    static boolean palindrome(String word){
        if(word.length() == 0){
            return true;
        } else if(word.length() == 1){
            return false;
        }else{
            for(int i=0; i<(word.length()/2); i++){
                char frontPointer = word.charAt(i);
                char backPointer = word.charAt(word.length()-1-i);
                if(frontPointer != backPointer){
                    return false;
                }
            }
            return true;
        }
    }
}
