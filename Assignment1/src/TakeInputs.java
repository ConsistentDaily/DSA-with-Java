import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class TakeInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int num = sc.nextInt();
            if(num == 'x'){
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
