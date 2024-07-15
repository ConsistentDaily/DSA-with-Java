public class TargerArrayOrder {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4};
        int[] indexes = {0,1,2,2,1};
        int[] target = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int index = indexes[i];
            int value = numbers[i];

            // Shift existing elements to the right
            for (int j = target.length - 1; j > index; j--) {
                target[j] = target[j - 1];
            }

            // Insert the current number at the correct index
            target[index] = value;
        }
        for(int nums : target){
            System.out.print(nums);
        }
    }
}
