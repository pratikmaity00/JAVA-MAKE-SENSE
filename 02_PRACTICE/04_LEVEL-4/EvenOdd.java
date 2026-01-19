public class EvenOdd {
    public static void main(String[] args) {
        // count even and odd didgits in a number
        int num = 513, even = 0, odd = 0;
        while(num != 0){
            int rem = num % 10;
            if(rem % 2 == 0) even++;
            else odd++;
            num /= 10;
        }
        System.out.println("Even Count " + even);
        System.out.println("Odd Count " + odd);
    }
}
