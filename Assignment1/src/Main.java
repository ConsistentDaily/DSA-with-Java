import java.util.Scanner;

//Input a year and find whether it is a leap year or not.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int ans = LearYear(year);
        System.out.println(ans);
    }
    static int LearYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
        return year;
    }
}