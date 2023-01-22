package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class questions {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<String>(Arrays.asList("phone","blue","pixel")));
        items.add(new ArrayList<String>(Arrays.asList("computer","silver","phone")));
        items.add(new ArrayList<String>(Arrays.asList("phone","gold","iphone")));
        String ruleKey = "type";
        String  ruleValue = "p";
        // System.out.println(items);
        System.out.println(check(ruleKey,ruleValue,items));

    }
    static int check(String ruleKey, String ruleValue, List<List<String>> items) {
        ArrayList<String> type = new ArrayList<>();
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();

        int count = 0;

        for(int i = 0; i < items.size(); i++){
            for(int j = 0; j < items.get(i).size(); j++){
                if(j == 0){
                    type.add(items.get(i).get(j));
                }
                if(j == 1){
                    color.add(items.get(i).get(j));
                }
                if(j == 2){
                    name.add(items.get(i).get(j));
                }
            }
        }

        if(ruleKey == "color"){
            for(int  i =0; i < color.size(); i++){
                if(color.get(i) == ruleValue){
                    count++;
                }
            }
        }

        else if(ruleKey == "type"){
            for(int  i =0; i < type.size(); i++){
                if(type.get(i) == ruleValue){
                    count++;
                }
            }
        }

        else{
            for(int  i =0; i < name.size(); i++){
                if(name.get(i) == ruleValue){
                    count++;
                }
            }
        }

        return count;

}
}