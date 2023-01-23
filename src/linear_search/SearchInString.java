package linear_search;

public class SearchInString {
    public static void main(String[] args) {
        String word = "Sunil";
        char ch = 'n';
        System.out.println(findChar(word, ch));
    }
    static boolean findChar(String word, char ch){
        if(word.length() == 0){
            return false;
        }
        for (int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}
