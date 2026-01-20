public class Power {
    public static void main(String[] args) {
        // Given a number, return true if power of 2, else false.
        int n = 64;
        boolean isWhat = true;
        if(n<=0){
            isWhat = false;
        }else {
            while(n != 1) {
                if(n % 2 != 0) {
                    isWhat = false;
                    break;
                }
                n /= 2;
            }
        }
        System.out.println(isWhat);
        
    }
}
