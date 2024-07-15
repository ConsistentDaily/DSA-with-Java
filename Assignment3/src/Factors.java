public class Factors {
    public static void main(String[] args) {
        int factorial = 123;
        int half = factorial/2 + 1;
        int count = 0;
        for(int i=1;i<=half;i++){
            if(factorial % i == 0){
                System.out.println(i);
                count ++;
            }
        }
        if(count < 2){
            System.out.println(factorial);
        }
    }
}
