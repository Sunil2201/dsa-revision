package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 12, 17, 20};
        System.out.println(search(arr, 90, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }
        else if(target < arr[m]){
            return search(arr, target, s, m-1);
        }
        else{
            return search(arr, target, m+1, e);
        }
    }
}
