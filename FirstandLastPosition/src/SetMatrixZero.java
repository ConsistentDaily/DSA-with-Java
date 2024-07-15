//public class SetMatrixZero {
//    public static void main(String[] args) {
//        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//
//        for(int i = 0; i< matrix[i].length - 1; i++){
//            for(int j = matrix[i][0] ; j < matrix[i].length -1 ;j++){
//
//                //to make the complete row zero
//                if(matrix[i][j] == 0 && j > 0){
//                    if(matrix[i][j-1] != 0){
//                        matrix[i][j-1] = 0;
//                        j--;
//                    }
//                    if(matrix[i][j+1] != 0){
//                        matrix[i][j+1] = 0;
//                        j++;
//                    }
//                }
//
//                //to make the complete column zero
//                if(matrix[i][j] == 0 && i >= 0){
//                    if(matrix[i-1][j] != 0){
//                        matrix[i-1][j] = 0;
//                        i--;
//                    }
//                    if(matrix[i-1][j] != 0){
//                        matrix[i+1][j] = 0;
//                        i++;
//                    }
//                }
//
//            }
//        }
//
//        //print matrix
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println(); // Move to the next line after printing each row
//        }
//    }
//}

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int m = matrix.length;
        int n = matrix[0].length;

        // Arrays to keep track of rows and columns to be zeroed
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];

        // First pass: identify the rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Second pass: set the identified rows to zero
        for (int i = 0; i < m; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Third pass: set the identified columns to zero
        for (int j = 0; j < n; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Print matrix
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
