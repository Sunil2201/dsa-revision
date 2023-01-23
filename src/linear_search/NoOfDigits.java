package linear_search;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(noOfDigits(234838383));
    }
    static int noOfDigits(int num){
        if(num < 0){
            num = num*-1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
