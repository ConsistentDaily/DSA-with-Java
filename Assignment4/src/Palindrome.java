import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        int ans = IsPalindrome(palindrome);
        System.out.println(ans);

    }
    static int IsPalindrome(int palindrome){
        int newpalindrome = 0;
        while(palindrome > 0){
            int digit = palindrome % 10;
            newpalindrome = newpalindrome * 10 + digit;
            palindrome /=10;
        }
        return newpalindrome;
    }

}
