public class PrimeInRange {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            if (i <= 1) {
                continue;
            } else {
                int count = 0;
                for (int j = 1; j <= n; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                } 

            }
        }

    }
}
