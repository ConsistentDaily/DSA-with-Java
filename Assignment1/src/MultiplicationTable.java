import java.util.Scanner;
//Take a number as input and print the multiplication table for it.
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int Mtable = MulTable(number);
        System.out.println(Mtable);
    }

    static int  MulTable(int number){
        int end = 10;
        int start = 0;
        while(start <= end){
            System.out.println(number + "*" + start + "=" + number*start);
            start++;
        }
        return 0;
    }
}
