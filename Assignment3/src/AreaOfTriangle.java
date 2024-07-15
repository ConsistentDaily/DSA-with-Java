import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float area = area(base, height);
        System.out.println(area);
    }
    static float area(float base , float height){
        float areas =  0.5f*base*height;
        return areas;
    }
}
