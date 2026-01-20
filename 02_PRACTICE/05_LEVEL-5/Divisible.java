public class Divisible {
    public static void main(String[] args) {
        // Count how many numbers between 1 and N are divisible by 3 or 5.

        int n = 10, count = 0;
        for(int i = 1; i<=n; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                // System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
