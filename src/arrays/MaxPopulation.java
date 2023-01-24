package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MaxPopulation {
    public static void main(String[] args) {
        int[][] logs =  {
                            {1982,1998},
                            {2013,2042},
                            {2010,2035},
                            {2022,2050},
                            {2047,2048}
                        };
        maximumPopulation(logs);
    }
    static void maximumPopulation(int[][] logs) {
        List<Integer> list = new ArrayList<>();
        List<Integer> modifiedList = new ArrayList<>();
        int maxCount = 1;
        for(int row=0; row<logs.length; row++){
            for(int year = logs[row][0]; year<logs[row][1]; year++){
                list.add(year);
            }
        }
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            int count = 0;
            for(int j=i+1; j<list.size(); j++){
                if(Objects.equals(list.get(j), list.get(i))){
                    count += 1;
                }
            }
            if(count >= maxCount){
                maxCount = count;
                modifiedList.add(list.get(i));
            }
        }
        System.out.println(modifiedList);
    }
}
