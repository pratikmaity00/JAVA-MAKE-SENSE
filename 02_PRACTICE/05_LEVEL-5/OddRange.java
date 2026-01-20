public class OddRange {
    public static void main(String[] args) {
        // Print the first N odd numbers using loop.

        int n = 20;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
