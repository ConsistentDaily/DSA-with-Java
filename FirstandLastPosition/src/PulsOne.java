class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] newarr = plusOne(arr);
        for (int n : newarr) {
            System.out.print(n);
        }
        System.out.println();
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all the digits are 9, we need an extra place for the carry
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
