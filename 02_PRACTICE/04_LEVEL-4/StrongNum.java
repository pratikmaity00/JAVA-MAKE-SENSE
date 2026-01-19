public class StrongNum {
    public static void main(String[] args) {
        // Check whether a number is strong number.
        int num = 145, strong = 0, org = num;
        while (num != 0) {
            int rem = num % 10;
            int fact = 1;
            for(int i = 0; i < rem; i++) {
                fact *= (rem-i);
            }
            strong += fact;
            num /= 10;
        }
        // System.out.println(strong);
        if(org == strong) {
            System.out.println(org + " is a Strong number.");
        }else {
            System.out.println(org + " is not a Strong number.");
        }
    }
}
