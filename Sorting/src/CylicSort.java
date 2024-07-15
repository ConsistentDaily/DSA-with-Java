public class CylicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cylicsort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    static void cylicsort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
