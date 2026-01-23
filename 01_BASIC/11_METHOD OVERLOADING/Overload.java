class Cal {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, int b) {
        return a + b;
    }
}
public class Overload {
    public static void main(String[] args) {
        Cal obj = new Cal();

        int res = obj.add(5,4);
        System.out.println(res);
    }
}
