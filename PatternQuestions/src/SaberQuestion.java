    //my method{
    //    the array is [19,20,21,22,23]
    //        the array should become [19,21,23,22,20]
    //        take even indexes [19, 21, 23]
    //                sort the even indexs in ascending order [19,21,23]
    //        take the odd indexes [20,22]
    //                sort the odd indexes in descending order [22,20]
    //        now concatinate even indexes and odd indexes
    //                [19,21,23] +" "+ [22,20] = [19,21,23,22,20]
    //        }

    import java.util.Arrays;
    import java.util.Scanner;

    public class SaberQuestion {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//
//            int arr[] = {19,20,21,22,23};
//    //        int[] arr = new int[n];
//    //
//    //        for(int i = 0; i<=n; i++){
//    //            arr[i] = sc.nextInt();
//    //        }
//            int[] result = getresult(arr,n);
//            for(int i=0;i<result.length;i++){
//                System.out.print(i + " ");
//            }
//        }
//
//        static int[] getresult(int[] arr, int n){
//            int[] firstpart = getsortedoddindexes(arr, n);
//            int[] secondpart = getsortedevenindexes(arr, n);
//
//            int[] result = new int[n];
//            result = Arrays.copyOf(firstpart,firstpart.length);
//            result = Arrays.copyOf(secondpart,result.length);
//
//            return result;
//
//        }
//
//        static int[] getsortedevenindexes(int[] arr, int n){
//            int[] evenindexes = new int[(n+1)/2];
//            int index = 0;
//            for(int i = 0; i < n; i++){
//                if(i % 2 == 0){
//                    //add the value of arr[i] to evenindexes
//                    evenindexes[index] = arr[i];
//                    index++;
//                }
//            }
//
//            ascsort(evenindexes, evenindexes.length);
//            return evenindexes;
//        }
//
//        static int[] getsortedoddindexes(int[] arr, int n){
//            int[] oddindexes = new int[(n+1)/2];
//            int index = 0;
//            for(int i = 0; i < n; i++){
//                if(i % 2 != 0){
//                    //add the value of arr[i] to oddindexes
//                    oddindexes[index] = arr[i];
//                    index++;
//                }
//            }
//            decsort(oddindexes, oddindexes.length);
//            return oddindexes;
//        }
//
//        static void ascsort(int[] arr, int n){
//            for(int i=1; i<n;i++){
//                int key = arr[i];
//                int j = i-1;
//
//
//                while(j >=0 && arr[j] > key){
//                    arr[j+1] = arr[j];
//                    j = j-1;
//                }
//                arr[j+1] = key;
//            }
//
//        }
//
//        static void decsort(int[] arr, int n){
//            for(int i=1; i<n;i++){
//                int key = arr[i];
//                int j = i-1;
//
//                while(j >=0 && arr[j] < key){
//                    arr[j+1] = arr[j];
//                    j = j-1;
//                }
//                arr[j+1] = key;
//            }
//        }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 5; // Hardcoded to match the array size
    // int n = sc.nextInt(); // If you want to take input for size

    int[] arr = {19, 20, 21, 22, 23};

    int[] result = getresult(arr, n);
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }
}

        static int[] getresult(int[] arr, int n) {
            int[] evenPart = getsortedevenindexes(arr, n);
            int[] oddPart = getsortedoddindexes(arr, n);

            int[] result = new int[n];
            int evenIndex = 0, oddIndex = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    result[i] = evenPart[evenIndex++];
                } else {
                    result[i] = oddPart[oddIndex++];
                }
            }
            return result;
        }

        static int[] getsortedevenindexes(int[] arr, int n) {
            int[] evenindexes = new int[(n + 1) / 2];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    evenindexes[index] = arr[i];
                    index++;
                }
            }
            ascsort(evenindexes, evenindexes.length);
            return evenindexes;
        }

        static int[] getsortedoddindexes(int[] arr, int n) {
            int[] oddindexes = new int[n / 2];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    oddindexes[index] = arr[i];
                    index++;
                }
            }
            decsort(oddindexes, oddindexes.length);
            return oddindexes;
        }

        static void ascsort(int[] arr, int len) {
            for (int i = 1; i < len; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }

        static void decsort(int[] arr, int len) {
            for (int i = 1; i < len; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }


    }
