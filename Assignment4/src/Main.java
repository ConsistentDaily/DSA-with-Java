import java.util.Scanner;

//Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Max(num1, num2, num3);
        int min = Min(num1, num2, num3);

        System.out.println("Max and Min are");
        System.out.println(max);
        System.out.println(min);
    }

    static int Max(int num1, int num2, int num3){
        int max = num1;
        if(max < num2){
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return  max;
    }

    static int Min(int num1, int num2, int num3){
        int min = num1;
        if(min > num2){
            min = num2;
        }
        if(min > num3) {
            min = num3;
        }
        return  min;
    }
}