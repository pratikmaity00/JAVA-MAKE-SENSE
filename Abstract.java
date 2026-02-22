abstract class Car {
    abstract void drive();
}
class Tata extends Car {
    void drive() {
    System.out.println("Vo..ooo...oo");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Car obj = new Tata();
        obj.drive();
    }
}
