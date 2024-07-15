public class ArrayProductExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = product(arr);
        System.out.println(result);
        }

    private static int[] product(int[] arr) {
        int[] prod = new int[arr.length];
        int tempsprod = 1;
        int end = arr.length - 1;
        int mid = 0;
        for(int i = 0; i<=end;i++){
            int start = 0;
            mid = i;
            if(mid == i){
                arr[mid] = arr[0];
                arr[0] = arr[mid];
                arr[i] = arr[0];
            }

        }

    }
}

