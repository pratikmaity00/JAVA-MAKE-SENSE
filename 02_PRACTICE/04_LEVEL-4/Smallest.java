public class Smallest {
    public static void main(String[] args) {
        // Find the Smallest digit in a number.
        int num = 115, smallDigit = 9;
        while(num != 0){
            int rem = num % 10;
            if(rem < smallDigit) {
                smallDigit = rem;
            }
            num /= 10;
        }
        System.out.println(smallDigit);
    }
}
