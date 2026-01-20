public class Harshad {
    public static void main(String[] args) {
        // Check whether a number is a Harshad number or Niven Number. -> Number ÷ (sum of its digits) = whole number

        int num = 19, orginal = num, sumofDigits = 0;
        while (num != 0) {
            int rem = num % 10;
            sumofDigits += rem;
            num /= 10;
        }
        if(orginal % sumofDigits == 0) 
            System.out.println("It is a Harshad Number.");
        else
            System.out.println("It isn't a Harshad Number.");
    }
}
