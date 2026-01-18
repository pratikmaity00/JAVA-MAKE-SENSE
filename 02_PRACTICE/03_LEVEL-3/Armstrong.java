public class Armstrong {
    public static void main(String[] args) {
        int num = 153,count = 0 ,ans = 0;
        int org = num, checker = org;

        while(num != 0) {
            num /= 10;
            count++;
        }
        while (org != 0) {
            int rem = org%10;
            ans = ans + (int)Math.pow(rem,count);
            org  /= 10;
        }
        // System.out.println(ans);
        if(checker == ans) {
            System.out.println(checker + " is an Armstrong number.");
        }else {
            System.out.println(checker + " isn't an Armstrong number.");
        }
    }
}
