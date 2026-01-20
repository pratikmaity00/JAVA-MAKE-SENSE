public class SumofPrime {
    public static void main(String[] args) {
        // Find the sum of first N prime numbers.
        int n = 10, sum = 0;
        for(int i = 1; i<=n; i++) {
            if(i <= 1){
                continue;
            }else {
                int count = 0;
                for(int j = 1; j<=i; j++) {
                    if(i % j == 0) {
                        count++;
                    }
                }
                if(count == 2) {
                    sum += i;
                    // System.out.println(i);
                }
            }
        }
        System.out.println(sum);
    }
}

