package binary_search;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            if(numbers[start] + numbers[end] > target){
                end--;
            }
            else if(numbers[start] + numbers[end] < target){
                start++;
            }
            else{
                return new int[]{start+1, end+1};
            }
        }
        return new int[]{-1, -1};
    }
}
