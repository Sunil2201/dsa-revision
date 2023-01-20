package functions;

import java.util.Arrays;

public class ArrayMod {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        modifyArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void modifyArr(int[] nums){
        nums[0] = 99; // pointing to the same array object hence actual array is modified
    }
}
