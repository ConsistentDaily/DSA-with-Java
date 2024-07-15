import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        float radius = sc.nextFloat();
        float ans = 2*pi*radius;
        System.out.println(ans);

    }
}
