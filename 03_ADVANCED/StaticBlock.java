class School {
    static {
        System.out.println("Hello i am satic block.");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        School obj = new School();
        System.out.println("hi");
    }
}
