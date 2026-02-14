public class Strings {
    public static void main(String[] args) {
        String  name = "Pratik"; // String is class so it work as aobject behind the sense

        // String  name = new String("Pratik"); 
        System.out.println(name);
        System.out.println("hello" + name);

        StringBuffer sb = new StringBuffer("Pratik");
        sb.append("Maity");
        // sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
