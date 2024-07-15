public class InterviewQ1 {
    public static void main(String[] args) {
        int dice = 3;
        int num = 268945;
        int sum = 0;
        String s = String.valueOf(num);
        if (dice % 2 == 0) {
            for (int i = 0; i <= s.length(); i++) {
                if (i % 2 == 0) {
                    sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                }

            }
        } else {
            for (int i = 0; i <= s.length(); i++) {
                if (i % 2 != 0) {
                    sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                }

            }
        }


        System.out.println(sum);
    }
}




