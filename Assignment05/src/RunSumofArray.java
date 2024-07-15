public class RunSumofArray {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] ans = runsum(arr1);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
    static int[] runsum(int[] arr){
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for(int i=1;i< arr.length;i++){
            sum[i] = sum[i-1] + arr[i];
        }
        return sum;
    }

}
