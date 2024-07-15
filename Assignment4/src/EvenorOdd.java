//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans = isEven(number);
    }

    static int isEven(int number){
        if(number % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Else");
        }
        return 1;
    }
}
