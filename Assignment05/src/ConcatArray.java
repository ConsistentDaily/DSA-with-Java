public class ConcatArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        System.out.println("Concat method one: ");
        int[] result1 = ArrayConcat01(arr1, arr2);
        System.out.println();
        System.out.println("Concat method two: ");
        int[] result2 = ArrayConcat02(arr1,arr2);

    }

    static int[] ArrayConcat01(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);
        for(int i : result){
            System.out.print(i+" ");
        }
        return result;
    }

    static int[] ArrayConcat02(int[] arr1 , int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        for(int i=0;i<arr1.length;i++){
            result[i] = arr1[i];
        }

        for(int i=0; i< arr2.length;i++){
            result[arr1.length + i] = arr2[i];
        }
        for(int i:result){
            System.out.print( i +" ");
        }
        return result;
    }
}
