package binary_search;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            if(nums[start+1] == nums[start] && nums[end-1] == nums[end]){
                start += 2;
                end -= 2;
            }
            else if(nums[start+1] != nums[start]){
                return nums[start];
            }else{
                return nums[end];
            }
        }
        return 0;
    }
}
