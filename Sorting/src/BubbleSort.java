public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 6};
        bubbleSort(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
