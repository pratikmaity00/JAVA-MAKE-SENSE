public class Wierd {
    public static void main(String[] args) {
        // Given an integer n, print “Weird” or “Not Weird” based on   conditions (HackerRank style).
        int n = 2;
        if(n % 2 != 0) {
            System.out.println("Weird");
        }else if(n>=2 && n<=5) {
            System.out.println("Not Weird");
        }else if(n>=6 && n<=20) {
            System.out.println("Weird");
        }else {
            System.out.println("Not Weird");
        }
    }
}
