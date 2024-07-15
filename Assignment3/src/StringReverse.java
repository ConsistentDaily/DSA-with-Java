public class StringReverse {
    public static void main(String[] args) {
        String arr = "SANJAY";
        String reverse = " ";
        for (int i = arr.length()-1; i >= 0 ; i--){
            reverse += arr.charAt(i);
        }
        System.out.println(reverse);
    }
}
