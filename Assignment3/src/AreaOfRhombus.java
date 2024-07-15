import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float diagonal1 = sc.nextFloat();
        float diagonal2 = sc.nextFloat();
        float area = area(diagonal1, diagonal2);
        System.out.println(area);
    }
    static float area(float d1 , float d2){
        float areas =  0.5f*d1*d2;
        return areas;
    }
}
