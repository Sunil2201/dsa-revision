package strings;

public class StringHalves {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length()/2);
        String b = s.substring(s.length()/2, s.length());
        int countOfFirstHalf = 0;
        int countOfSecondHalf = 0;
        for(int i=0; i<a.length(); i++){
            if(isVowel(a.charAt(i))){
                countOfFirstHalf++;
            }
        }
        for(int i=0; i<b.length(); i++){
            if(isVowel(b.charAt(i))){
                countOfSecondHalf++;
            }
        }
        if(countOfFirstHalf == countOfSecondHalf){
            return true;
        }
        return false;
    }

    public static boolean isVowel(char ch){
        char[] dictionary = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i=0; i<dictionary.length; i++){
            if(ch == dictionary[i]){
                return true;
            }
        }
        return false;
    }
}
