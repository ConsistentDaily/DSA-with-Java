public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10, 12, 23, 34, 36};
        int target = 11;
        int ans = flooring(arr , target);
        System.out.println(arr[ans]);
    }

    static int flooring(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length -1]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}

//public class Smallest {
//
//    public static void main(String[] args) {
//        char[] arr = {'c', 'f', 'j'};
//        char target = 'a';
//
//        char result = nextGreatestLetter(arr, target);
//        System.out.println(result);
//    }
//
//    public static char nextGreatestLetter(char[] letters, char target) {
//        if (target >= letters[letters.length - 1]) {
//            return letters[0];
//        }
//
//        int start = 0;
//        int end = letters.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < letters[mid]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return letters[start % letters.length];
//    }
//}
