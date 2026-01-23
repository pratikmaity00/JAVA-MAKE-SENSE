class Add {
    int x = 4;
    public void add() {
        System.out.println("Hello");
    }
}
public class Obj {
    public static void main(String[] args) {
        Add myObj = new Add();
        myObj.add();
    }
}
