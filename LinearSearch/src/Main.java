public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target = 9;
        int ans = LinearSearch(nums , target);
        System.out.println(ans);
    }

    public static int LinearSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
//        for (int i=0; i<arr.length; i++){
//            int element = arr[i];
//            if(element == target){
//                return i;
//            }
        for (int element: arr){
            if(element == target){
                return  element;
            }
        }
        return  -1;
    }
}

