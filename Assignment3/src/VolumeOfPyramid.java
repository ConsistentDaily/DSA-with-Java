import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float BaseArea = side * side;
        float height = sc.nextFloat();
        float volume =(float) 0.5 * BaseArea*height;
        System.out.println(volume);
    }
}
