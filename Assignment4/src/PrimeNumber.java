import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean ans = isPrime(number);
    }
    static boolean isPrime(int number){
        int count = 0;
        int half = number;
        for(int i =2; i <= half;i++){
            if(number % i == 0){
                count ++;
            }
        }

        if(count <=1){
            System.out.println(true);
        }
        return false;
    }
}
