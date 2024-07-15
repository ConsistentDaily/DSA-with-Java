import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float constant = 3/4f;
        float pi = 3.14f;
        System.out.println("Enter Radius: ");
        float radius = sc.nextFloat();
        System.out.println("Volume: ");
        float volume = constant * pi * (radius*radius*radius);
        System.out.println(volume);
    }
}
