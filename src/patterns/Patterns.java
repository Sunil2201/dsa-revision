package patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern17(4);
    }

    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            // for every row, run the col
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            // for every row, run the col
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=n; row>=1; row--){
            // for every row, run the col
            for(int col=row; col>=1; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            // for every row, run the col
            for(int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1; row<=2*n-1; row++){
            if(row<=n){
                for(int col=1; col<=row; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int col=2*n-row; col>=1; col--){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
    static void pattern28(int n){
        for(int row=1; row<=2*n-1; row++){
            int totalColsInRow = row>n ? 2*n-row : row;
            int noOfSpaces = n-totalColsInRow;
            for(int i=1; i<=noOfSpaces; i++){
                System.out.print(" ");
            }
            for(int col=1; col<=totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int row=1; row<=n; row++){
            for(int space=1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int row=1; row<=2*n-1; row++){
            int spaceInEachRow = row > n ? row-n : n-row;
            for(int space=1; space<=spaceInEachRow; space++){
                System.out.print("  ");
            }
            int colsInEachRow = row > n ?  2*n-row : row;
            for(int col=colsInEachRow; col>=1; col--){
                System.out.print(col + " ");
            }
            for(int col=2; col<=colsInEachRow; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        for(int row=1; row<=2*n-1; row++){
            for(int col=1; col<=2*n-1; col++){
                int atEveryIndex = 34343;
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}
