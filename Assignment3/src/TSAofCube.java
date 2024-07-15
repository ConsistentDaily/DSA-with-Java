import java.util.Scanner;

public class TSAofCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();

        float tsa = (float)6*(side*side);
        System.out.println(tsa);
    }
}
