import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        while(true){
            int input = sc.nextInt();
            sum += input;
            if(input == 0){
                break;
            }
            System.out.println(sum);
        }
    }
}
