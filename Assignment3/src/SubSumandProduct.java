import java.util.Scanner;

public class SubSumandProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 1;
        int sum =0;
        int temp = number;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /=10;
        }
        int sub = product - sum ;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(sub);

    }
}
