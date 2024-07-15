public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,};
        int n = 10;
        int[] ans = shuffle(arr,n);
        for(int i:ans){
            System.out.print(i + " ");
        }
    }

    static int[] shuffle(int[] arr , int n){
        int[] arr1 = new int[2*n];
        for(int i=0;i<n ; i++){
            arr1[2*i] = arr[i];
            arr1[(2*i)+1] = arr[i+n];
        }
        return arr1;
    }
}
