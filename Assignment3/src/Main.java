import java.util.Scanner;
//Area Of Circle Java Program
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float ans = AreaOfCircle(radius);
        System.out.println(ans);

    }

    static float AreaOfCircle(float radius){
        float pi = 3.14f;
        return pi *radius*radius;

    }
}