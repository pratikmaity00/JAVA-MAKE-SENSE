public class Largest {
    public static void main(String[] args) {
        // Find the largest digit in a number.
        int num = 325, largeDigit = 0;
        while(num != 0){
            int rem = num % 10;
            if(rem > largeDigit) {
                largeDigit = rem;
            }
            num /= 10;
        }
        System.out.println(largeDigit);
    }
}
