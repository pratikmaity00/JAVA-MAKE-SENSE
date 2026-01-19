public class AsciValue {
    public static void main(String[] args) {
        // Print the ASCII value of characters A–Z.
        for(char ch='A'; ch<='Z'; ch++) {
            int asciVal = (int) ch;
            System.out.println(ch + " : " + asciVal);
        }
    }
}
