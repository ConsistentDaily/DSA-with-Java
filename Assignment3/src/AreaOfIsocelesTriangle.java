import java.util.Scanner;

public class AreaOfIsocelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float equalside = sc.nextFloat();
        float base = sc.nextFloat();
        float Area = area(equalside,base);
        System.out.println(Area);
    }
    static float area(float equalside, float base){
        float ans = (float) (0.5*base*(Math.sqrt((equalside*equalside) - (base/2)*(base/2))));
        return  ans;
    }
}
