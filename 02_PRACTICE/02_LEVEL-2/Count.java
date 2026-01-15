public class Count {
    public static void main(String[] args) {
        int count = 0;
        int n = 12345;
        // int len = String.valueOf(num).length();
        // System.out.println(len);

        while(n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
