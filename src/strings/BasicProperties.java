package strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicProperties {
    public static void main(String[] args) {
        String a = "Sunil";
        String b = "Sunil";
        a = "Let's take LeetCode contest";
        String ans = "G()(al)";
        ans.replaceAll("(al)", "al");
//        System.out.println(ans);

        String[] splitArray =  a.split(" ");
        String finalAns = "";
        for(int i=0; i <= splitArray.length-1; i++){
            for(int j=splitArray[i].length()-1; j>=0; j--){
                finalAns += splitArray[i].charAt(j);
            }
            finalAns += " ";
        }
        System.out.println(finalAns.trim());


//        System.out.println(a);
//        System.out.println(b);
    }


}
