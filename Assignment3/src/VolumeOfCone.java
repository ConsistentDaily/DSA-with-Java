import java.util.Scanner;
//v = 1/3 * pi * r^2 * h
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        float height = sc.nextFloat();
        float radius = sc.nextFloat();
        float ans = (float) 0.333 * pi * (radius*radius)*height;
        System.out.println(ans);
    }
}
