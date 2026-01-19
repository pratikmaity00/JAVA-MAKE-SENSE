public class DivisibleBy {
    public static void main(String[] args) {
        // Print numbers that are divisible by 3 but not 5.
        for(int i = 1; i <= 10; i++){
            if(i % 3 == 0 && i % 5 != 0)
                System.out.println(i);
        }
    }
}
