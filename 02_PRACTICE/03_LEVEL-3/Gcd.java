public class Gcd {
    public static void main(String[] args) {
        // GCD or HCF are same terms
        int num1 = 12, num2 = 18 ,gcd = 0;
        for(int i = 1; i<=num1 && i<= num2; i++){
            if(num1%i == 0 && num2%i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD is : " + gcd);


        // int a = 12, b = 18;
        // int gcd = 1;

        // int min = (a < b) ? a : b;

        // for (int i = 1; i <= min; i++) {
        //     if (a % i == 0 && b % i == 0) {
        //         gcd = i;
        //     }
        // }

        // System.out.println("GCD is: " + gcd);
    }
}
