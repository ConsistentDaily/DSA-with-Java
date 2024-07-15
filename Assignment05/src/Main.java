import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] perm = {0, 1, 2, 3};  // Example permutation
        int[] nums = {5, 7, 3, 2};  // Example original array

        int[] result = buildArray(nums, perm);

        // Print the resulting array
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Permutation array: " + Arrays.toString(perm));
        System.out.println("Resulting array: " + Arrays.toString(result));
    }

    public static int[] buildArray(int[] nums, int[] perm) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[perm[i]];
        }

        return result;
    }
}