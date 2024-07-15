import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        float Area = perimeter(length,breadth);
        System.out.println(Area);
    }

    static float perimeter(float length, float breadth){
        return 2*(length + breadth);
    }
}
