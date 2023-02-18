package arrays;

import java.util.ArrayList;

public class RunLength {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(decompressRLElist(nums));
    }
    public static ArrayList decompressRLElist(int[] nums) {
        ArrayList ans = new ArrayList();
        for(int i=0; i<nums.length/2; i++){
            int freq = nums[2*i];
            int val = nums[2*i+1];
            for(int j=0; j<freq; j++){
                ans.add(val);
            }
        }
        int[] arrayForm = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            arrayForm[i] = (int) ans.get(i);
        }
        System.out.println(ans.get(0));
        return ans;
    }
}
