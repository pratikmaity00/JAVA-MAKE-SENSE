
public class Final {
    public static void main(String[] args) {
        final class NotUse {
            // not inherit
        }
        class F1 {
            final void show() {
                System.out.println("F1");
            }
        }
        class F2 extends F1{
            // void show() {
            //     System.out.println("F1");
            // }
        }
        final double pi = 3.14;
        // pi = 21; // not initailize again
        System.out.println(pi);
    }
}
