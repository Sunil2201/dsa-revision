package binary_search;

import java.util.Arrays;

public class FairCandyShop {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        for(int i=0; i<aliceSizes.length; i++){
            for(int j=0; j<bobSizes.length; j++){
                int temp = aliceSizes[i];
                aliceSizes[i] = bobSizes[j];
                bobSizes[j] = temp;
                if(sum(aliceSizes) == sum(bobSizes)){
                    return new int[]{bobSizes[j], aliceSizes[i]};
                }
            }
        }
        return new int[]{0,0};
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
