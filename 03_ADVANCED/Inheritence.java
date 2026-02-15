class Calc {
    public int add(int x, int y) {
        return x + y;
    }
    public int sub(int x, int y) {
        return x - y;
    }
}

class AdvCalc extends Calc {
    public int multiply(int x, int y) {
        return x * y;
    }
    public int div(int x, int y) {
        return x / y;
    }
}

class SciCal extends AdvCalc {
    public double pow(int x, int y) {
        return Math.pow(x, y);
    }
}
public class Inheritence {
    public static void main(String[] args) {
        SciCal obj = new SciCal();
        int res1 = obj.add(5,5);
        int res2 = obj.sub(8,5);
        int res3 = obj.multiply(5,5);
        int res4 = obj.div(10,5);
        double res5 = obj.pow(2,3); 
        System.out.println(res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5);
    }
}
