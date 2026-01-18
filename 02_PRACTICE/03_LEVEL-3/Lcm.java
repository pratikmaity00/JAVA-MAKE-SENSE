public class Lcm {
    public static void main(String[] args) {
        int num1 = 8, num2 = 12, gcd = 0;
        for(int i = 1; i<=num1 && i<=num2; i++){
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        // System.out.println("GCD is "+ gcd);
        int lcm = (num1*num2) / gcd;
        System.out.println("LCM is "+ lcm);
    }
}
