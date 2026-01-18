public class Fibonacci {
    public static void main(String[] args) {
        int n = 10,prevOne = 0, prevTwo = 1;
        System.out.println(prevOne);
        System.out.println(prevTwo);
        for(int i = 2; i<n; i++){
            int next = prevOne + prevTwo;
            prevOne = prevTwo;
            prevTwo = next;
            System.out.println(next); 
        } 
    }
}
