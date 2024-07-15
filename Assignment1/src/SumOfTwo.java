import java.util.Scanner;
//Take two numbers and print the sum of both.

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = sum(num1, num2);
        System.out.println(ans);
    }
    static int sum(int num1 , int num2){
        return num1 + num2;
    }
}
