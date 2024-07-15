import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first_num =0;
        int second_num =1;
        int sum =1;
        for(int i =1; i<=n;++i){
            sum = first_num + second_num;
            first_num = second_num;
            second_num = sum;
            System.out.println(sum);
        }
    }
}
