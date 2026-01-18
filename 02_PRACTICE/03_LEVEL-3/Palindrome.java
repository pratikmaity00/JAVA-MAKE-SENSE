public class Palindrome {
    public static void main(String[] args) {
        int num = 152,rev = 0;
        int org = num;
        while(num != 0) {
            int rem = num%10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(org == rev) {
            System.out.println(org + " is Palindrome.");
        }else {
            System.out.println(org + " isn't Palindrome.");
        }
    }
}
