package arrays;

public class OperationsArray {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                ans += 1;
            }
            else {
                ans -= 1;
            }
        }
        return ans;
    }
}
