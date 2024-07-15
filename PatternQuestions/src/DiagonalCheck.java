import java.util.*;

public class DiagonalCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the matrix M and N
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        // Input the integer k
        System.out.print("Enter the integer k: ");
        int k = scanner.nextInt();

        // Initialize the 2D array
        int[][] matrix = new int[M][M];  // Assuming M is the larger dimension

        // Fill the matrix with integers (for simplicity, assuming they are given)
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Fill the remaining positions with 1 if the array is not square
        if (M != N) {
            for (int i = 0; i < M; i++) {
                for (int j = N; j < M; j++) {
                    matrix[i][j] = 1;
                }
            }
        }

        // Check if all elements of the left diagonal occur more than k times in the matrix
        boolean isPresent = checkLeftDiagonal(matrix, k);

        // Output the result
        if (isPresent) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }

        scanner.close();
    }

    // Function to check if all elements of the left diagonal occur more than k times in the matrix
    private static boolean checkLeftDiagonal(int[][] matrix, int k) {
        int M = matrix.length;
        Set<Integer> diagonalElements = new HashSet<>();

        // Collect elements from the left diagonal
        for (int i = 0; i < M; i++) {
            diagonalElements.add(matrix[i][i]);
        }

        // Check occurrence of each diagonal element in the matrix (excluding the diagonal)
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (i != j) {
                    int element = matrix[i][j];
                    elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
                }
            }
        }

        // Check if all diagonal elements occur more than k times
        for (int element : diagonalElements) {
            if (elementCount.getOrDefault(element, 0) <= k) {
                return false;
            }
        }

        return true;
    }
}
