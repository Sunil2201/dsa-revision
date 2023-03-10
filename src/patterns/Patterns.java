package patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern15(5);
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
    static void pattern6(int n){
        for(int row=1; row<=n; row++){
            // printing space
            for(int space = 1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row=1; row<=n; row++){
            for(int space=1; space<=row-1; space++){
                System.out.print(" ");
            }
            for(int col=n; col>=row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int row=0; row<n; row++){
            for(int space = 1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int row=1; row<=n; row++){
            for(int space=1; space<=row-1; space++){
                System.out.print(" ");
            }
            for(int col=n; col>=row; col--){
                System.out.print("*");
            }
            for(int col=1; col<=n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row=1; row<=n; row++){
            for(int space = 1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for(int row=0; row<n; row++){
            for(int space=1; space<=row; space++){
                System.out.print(" ");
            }
            for(int col=0; col<n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int row=1; row<=2*n; row++){
            int spaceInEachRow = row<=n ? row : 2*n+1-row;
            for(int space=0; space<spaceInEachRow; space++){
                System.out.print(" ");
            }
            int colsInEachRow = row<=n ? n+1-row : row-n;
            for(int col=0; col<colsInEachRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for(int row=1; row<=n; row++){
            for(int space=1; space<=n-row; space++){
                System.out.print(" ");
            }
            if(row==5){
                for(int col=1; col<2*n; col++){
                    System.out.print("*");
                }
                break;
            }
            //First Half
           for(int col=1; col<=row; col++){
               if(col == 1){
                   System.out.print("*");
               }else System.out.print(" ");
           }
            // Second Half
           for(int col=row+1; col<=2*row-1; col++){
               if(col == 2*row-1) System.out.print("*");
               else System.out.print(" ");
           }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for(int row=1; row<=n; row++){
            if(row == 1){
                for(int col=1; col<2*n; col++){
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }
            // First half
            for(int col=1; col<=n; col++){
                if(col == row) System.out.print("*");
                else System.out.print(" ");
            }
            // Second Half
            for(int col=n+1; col<=2*n-row; col++){
                if(col == 2 * n - row) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for(int row=1; row<2*n; row++){
         int spacesInEachRow = row<=n ? n-row : row-n;
         for(int space=1; space<=spacesInEachRow; space++){
             System.out.print(" ");
         }
         int colsInFirstHalf = row<=n ? row : 2*n-row;
         for(int col=1; col<=colsInFirstHalf; col++){
             if(col == 1) System.out.print("*");
             else System.out.print(" ");
         }
         int colsInSecondHalf = row<=n ? row-1 : 2*n-1-row;
         for(int col=1; col<=colsInSecondHalf; col++){
             if(col == colsInSecondHalf) System.out.print("*");
             else System.out.print(" ");
         }
            System.out.println();
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
        int originalN = n;
        n=2*n;
        for(int row=0; row <= n; row++){
            for(int col=0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
