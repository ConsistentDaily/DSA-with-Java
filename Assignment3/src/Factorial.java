import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Factno = sc.nextInt();
        int temp = 1;
        for(int i = 1; i <= Factno;++i){
            temp = temp * i;
            System.out.println(temp);
        }
    }
}
