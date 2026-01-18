public class Factorial {
    public static void main(String[] args) {
        int n = 5,fact = 1;
        for(int i = 0; i<n; i++) {
            fact *= (n-i);
        }
        System.out.println("Factorial of " + n + " is " + fact);
        
    }
}
