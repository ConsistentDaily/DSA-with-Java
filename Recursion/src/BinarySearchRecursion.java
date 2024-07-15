public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;

        System.out.println(Search(arr,target,0,arr.length));
    }
    static int Search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return Search(arr, target, start,mid -1);
        }
        else{
            return Search(arr,target,mid+1,end);
        }

    }
}
