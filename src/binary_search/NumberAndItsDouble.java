package binary_search;

import java.util.Arrays;

public class NumberAndItsDouble {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int indexOfDouble = binarySearch(arr, 2*arr[i]);
            if(indexOfDouble > -1 && indexOfDouble != i){
                return true;
            }
        }
        return false;
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
