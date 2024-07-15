import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        float length = sc.nextFloat();
        System.out.println("Enter Width: ");
        float width = sc.nextFloat();
        float BaseArea = length * width;
        System.out.println("Enter Height: ");
        float height = sc.nextFloat();

        System.out.println("Volume: ");
        float volume = (float)BaseArea*height;
        System.out.println(volume);
    }
}
