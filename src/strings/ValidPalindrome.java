package strings;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String word = "A man, a plan, a canal: Panama";
        StringBuilder ansNew = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            ansNew.append(word.charAt(i));
        }
        System.out.println(ansNew.reverse());
//        String[] ans  = word.split(",");
//        System.out.println(Arrays.toString(ans));
    }
}
