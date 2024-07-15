import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = area(side);
        System.out.println(area);
    }
    static float area(float base){
        float areas =  (float)((float)(Math.sqrt(3))/4 * Math.pow(base,2));
        return areas;
    }
}
