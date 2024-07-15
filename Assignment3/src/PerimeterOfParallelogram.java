import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int ans = sum(s1,s2,s3,s4);
        System.out.println(ans);
    }

    static int sum(int s1, int s2, int s3, int s4){
        return s1 + s2 + s3 + s4;
    }
}
