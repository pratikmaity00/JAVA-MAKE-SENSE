public class Pattern9 {
    public static void main(String[] args) {
         int rows = 4;

        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {

            // spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
