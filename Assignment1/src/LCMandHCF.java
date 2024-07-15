//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;
//Take 2 numbers as inputs and find their HCF and LCM.
public class LCMandHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = HCF(num1,num2);
        int lcm = LCM(num1,num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    static int HCF(int num1 , int num2){
        int hcf = 1;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }

    static int LCM(int num1 , int num2){
        int lcm = (num1 * num2)/HCF(num1,num2);
        return lcm;
    }
}
