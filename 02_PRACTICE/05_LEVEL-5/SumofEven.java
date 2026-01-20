public class SumofEven {
    public static void main(String[] args) {
        // Print all numbers between 1 and N whose digit sum is even.

        int n = 20;
        for(int i = 1; i<=n; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            if(sum % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
