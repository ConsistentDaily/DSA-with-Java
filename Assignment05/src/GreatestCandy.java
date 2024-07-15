public class GreatestCandy {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extras = 3;
        for(int candy : candies){
            candy += 3;
            if(candy >= isMax(candies)){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
    }

    static int isMax(int[] arr){
        int max = 0;
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
