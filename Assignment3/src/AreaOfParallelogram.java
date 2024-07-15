import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float Area = area(base,height);
        System.out.println(Area);
    }

    static float area(float length, float breadth){
        return length*breadth;
    }
}
