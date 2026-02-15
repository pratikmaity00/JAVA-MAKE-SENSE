public class Construcctor {
    int x;
    String str;

    public Construcctor() {
        this.x = 16;
        this.str = "Raju";
    }
    
    public Construcctor(int n, String str1) {
        this.x = n;
        this.str = str1;
    }

    public static void main(String[] args) {
        Construcctor obj = new Construcctor();
        Construcctor obj1 = new Construcctor(23,"Pratik");
        System.out.println(obj.x + " " + obj.str);
        System.out.println(obj1.x + " " + obj1.str);
    }
}
