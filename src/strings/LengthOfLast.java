package strings;

import java.util.Arrays;

public class LengthOfLast {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    static int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split(" ");
        return arrOfStr[arrOfStr.length-1].length();
    }
}
