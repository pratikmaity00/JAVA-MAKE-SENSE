public class Digit {
    public static void main(String[] args) {
        // Count how many times a digit appears in a number.
        int num = 12323335, count = 0, key = 3;
        while(num != 0) {
            int rem = num % 10;
            if(rem == key) {
                count++;
            }
            num /= 10;
        }
        System.out.println("Digits appears " + count + " times.");
    }
}
