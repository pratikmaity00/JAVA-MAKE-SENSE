public class Automorphic {
    public static void main(String[] args) {
        // Check whether a number is automorphic. -> A number whose square ends with the same digits as the number itself.

        int num = 25, org = num;
        int square =(int) Math.pow(org, 2);

        int lastDigit_square = 0;
        while (square != 0) {
            int rem = square % 10;
            lastDigit_square = rem;
            break;
        }

        int lastDigit_Original = 0;
        while (num !=0) {
            int rem = num % 10;
            lastDigit_Original = rem;
            break;
        }

        if(lastDigit_Original == lastDigit_square)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");

    }
}
