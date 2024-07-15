/*Trick to solve Pattern Questions
How to approach
1) -> Run the outer for loop
        no of lines = no of row
        that = no of times outer loop will run

Note: Try to find the formula
      relating rows and columns
2) -> Identify for every row number
        >>how many columns are there
        >>Type of element in col

3) -> What do you need to print
 */


public class Main {
    public static void main(String[] args) {
        int n = 5;
        pattern31(n);
    }

    static void pattern2(int n){
        for(int row =0; row <= n;row++){
            //for every row, run the col
            for (int col =1; col <= row; col++){
                System.out.print("* ");
            }
            //when one row is printed go to next line
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int row =0; row <= n;row++){
            //for every row, run the col
            for (int col =1; col <= n; col++){
                System.out.print("* ");
            }
            //when one row is printed go to next line
            System.out.println();
        }

    }

    static void pattern3(int n){
        for(int row =0; row <= n;row++){
            //for every row, run the col
            for (int col = n - row +1; col >=1; col--){
                System.out.print("* ");
            }
            //when one row is printed go to next line
            System.out.println();
        }

    }

    static void pattern4(int n){
        for(int row =0; row <= n;row++){
            //for every row, run the col
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            //when one row is printed go to next line
            System.out.println();

        }

    }

    static void pattern5(int n){
        for(int row =0; row <= 2*n -1 ;row++){
            int totalcolsInROw = row > n ? 2*n - row: row;
            for(int col=0;col<totalcolsInROw;col++){
                System.out.print("* ");
            }
            //when one row is printed go to next line
            System.out.println();

        }
    }

    static void pattern28(int n){
        for(int row =0; row <= 2*n ;row++){

            int totalcolsInROw = row > n ? 2*n - row: row;

            int noOfSpaces = n - totalcolsInROw ;
            for(int s =0; s < noOfSpaces;s++){
                System.out.print(" ");
            }

            for(int col=0;col<totalcolsInROw;col++){
                System.out.print("* ");
            }
            //when one row is printed go to next line
            System.out.println();

        }
    }

    static void pattern30(int n){
        for(int row =1; row <= n ;row++){

            for(int space = 0; space < n-row; space++){
                System.out.print(" ");
            }

            for(int col = row ; col >= 1; col--){
                System.out.print(col);
            }
            for(int col=2;col<= row;col++){
                System.out.print(col);
            }
             System.out.println();

        }
    }

    static void pattern31(int n){
        n = 2*n;
        for(int row = 0; row < n +1; row++){
            for(int col = 0; col < n+1; col++){
                /*we can do it reverse by doing n - math.min*/
                int atEveryIndex = Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }



}