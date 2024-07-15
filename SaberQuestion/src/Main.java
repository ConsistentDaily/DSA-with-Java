
public class Main {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {19, 20, 21, 22,23,24,25};
        //        int[] arr = new int[n];
        //
        //        for (int i = 0; i < n; i++) {
        //            arr[i] = sc.nextInt();
        //        }
        int[] result = getresult(arr, n);

        for(int elements:result){
            System.out.print(elements + " ");
        }
    }

    static int[] getresult(int[] arr, int n) {
        int[] firstpart = getsortedoddindexes(arr, n);
        int[] secondpart = getsortedevenindexes(arr, n);

        int[] result = new int[n];
        System.arraycopy(secondpart, 0, result, 0, secondpart.length);
        System.arraycopy(firstpart, 0, result, secondpart.length, firstpart.length);
        return result;
    }

    static int[] getsortedevenindexes(int[] arr, int n) {
        int[] evenindexes = new int[(n + 1) / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // add the value of arr[i] to evenindexes
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
                // add the value of arr[i] to oddindexes
                oddindexes[index] = arr[i];
                index++;
            }
        }
        decsort(oddindexes, oddindexes.length);
        return oddindexes;
    }

    static void ascsort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void decsort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
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
