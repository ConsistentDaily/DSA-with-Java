import java.util.Scanner;

public class CSAofCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        float radius = sc.nextFloat();
        float heigth = sc.nextFloat();
        float csa = (float)2*pi*radius*heigth;
        System.out.println(csa);
    }
}
