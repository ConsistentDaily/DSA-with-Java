public class MaxSumArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int Maxsum = maxsum(arr);
        System.out.println(Maxsum);
    }

    static int maxsum(int[] arr){
        int sum =0;
        int Maxsum = arr[0];
        for(int i=0;i< arr.length;i++){
            sum = sum + arr[i];
            if(sum>Maxsum){
                Maxsum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return Maxsum;
    }
}
