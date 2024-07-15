import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        float radius = sc.nextFloat();
        System.out.println("Enter Height: ");
        float height = sc.nextFloat();
        System.out.println("Volume : ");
        float volume = pi *radius*radius*height;
        System.out.println(volume);
    }
}
