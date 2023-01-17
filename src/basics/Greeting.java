package basics;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println(greeting(name));
    }
    static String greeting(String name){
        return "Hello, " + name;
    }
}
