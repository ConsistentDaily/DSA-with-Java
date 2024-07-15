import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        float Area = area(length,breadth);
        System.out.println(Area);
    }

    static float area(float length, float breadth){
        return length*breadth;
    }
}
