class Meth1 {
    public void show() {
        System.out.println("Hello Java in Meth1");
    }
}
class Meth2 extends Meth1 {
    public void show() {
        System.out.println("Hello Java in Meth2");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Meth2 obj1 = new Meth2();
        obj1.show();
    }
}
