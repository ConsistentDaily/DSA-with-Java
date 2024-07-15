//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix
// in any order.
//
//A lucky number is an element of the matrix such that it is the
// minimum element in its row and maximum in its column.
//
//Example 1:
//
//Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//Output: [15]
//Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.


public class LuckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        int[] luckyNumbers = findLuckyNumbers(matrix);
        for (int number : luckyNumbers) {
            if (number != Integer.MIN_VALUE) { // Check to skip placeholder values
                System.out.println(number);
            }
        }
    }

    public static int[] findLuckyNumbers(int[][] matrix) {
        int[] luckyNumbers = new int[matrix.length]; // Array to store lucky numbers
        int count = 0;

        // Initialize the array with a placeholder value
        for (int i = 0; i < luckyNumbers.length; i++) {
            luckyNumbers[i] = Integer.MIN_VALUE;
        }

        // Step 1: Find the minimum element in each row
        for (int i = 0; i < matrix.length; i++) {
            int minElement = matrix[i][0];
            int minIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minIndex = j;
                }
            }

            // Step 2: Check if the minElement is the maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > minElement) {
                    isLucky = false;
                    break;
                }
            }

            // If it is a lucky number, add it to the array
            if (isLucky) {
                luckyNumbers[count++] = minElement;
            }
        }

        return luckyNumbers;
    }
}
