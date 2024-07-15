public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] bankAccounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 3, 2}
        };
        System.out.println("The richest customer wealth is: " + maxwealth(bankAccounts));
    }
    static int maxwealth(int[][] BankAccounts){
        int ans = Integer.MIN_VALUE;
        for(int[] Person : BankAccounts){
            int sum = 0;
            for(int paccounts : Person){
                sum += paccounts;
            }
            if(sum > ans){
               ans = sum;
            }
        }
        return ans;
    }
}
