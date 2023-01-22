package arrays;

import java.util.Arrays;

public class OrderArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[index.length];
        for(int i=0; i<index.length; i++){
            for(int j=index.length-1; j>index[i]; j--){
                ans[j] = ans[j-1];
            }
            ans[index[i]] = nums[i];
        }
        return ans;
    }
}
