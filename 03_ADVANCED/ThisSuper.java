class A extends Object {
    public A() {
        super();
        System.out.println("A");
    }
    public A(int n) {
        super();
        System.out.println("A in INT");
    }
}
class B extends A {
    public B() {
        super();
        System.out.println("B");
    }
    public B(int n) {
        // super(n);
        this();
        System.out.println("B in INT");
    }
}
class ThisSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}