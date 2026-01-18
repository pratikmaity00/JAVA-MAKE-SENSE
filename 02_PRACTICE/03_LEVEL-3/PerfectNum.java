public class PerfectNum {
    public static void main(String[] args) {
        int num = 6, result = 0;
        for(int i = 1; i<=num; i++){
            if(num%i == 0){
                if(num == i) continue;
                result += i;
            }
        }
        // System.out.println(result);
        if(num == result)
            System.out.println(num + " is a Perfect Number.");
        else 
            System.out.println(num + " is not a Perfect Number.");
    }
}
