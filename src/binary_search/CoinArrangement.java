package binary_search;

public class CoinArrangement {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        int rowCount = 1;
        int remainingCoins = n;
        while(rowCount <= n){
            if(remainingCoins/rowCount == 1){
                return rowCount;
            }
            else if(remainingCoins/rowCount == 0){
                return rowCount-1;
            }
            remainingCoins = remainingCoins-rowCount;
            rowCount++;
        }
        return n;
    }
}
