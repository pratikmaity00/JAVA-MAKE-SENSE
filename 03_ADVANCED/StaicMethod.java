class Mobile {
    String brand;
    int price;

    static void show(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price);
    }
}
public class StaicMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 35000;
        Mobile obj2 = new Mobile();
        obj2.brand = "Iphone";
        obj2.price = 50000;

        Mobile.show(obj1);
        Mobile.show(obj2);
    }
}
