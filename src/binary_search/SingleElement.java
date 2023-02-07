package binary_search;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int ans = 0;
        while(start <= end){
            if(nums[start+1] != nums[start]){
                ans = nums[start];
            }else{
                ans = nums[end];
            }
            start += 2;
            end -= 2;
        }
        return ans;
    }
}
