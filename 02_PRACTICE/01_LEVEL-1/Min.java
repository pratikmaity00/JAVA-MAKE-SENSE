public class Min {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;
        int n3 = 1;

        if(n1<n2 && n1<n3)
            System.out.println(n1 + " is minimum");
        else if(n2<n1 && n2<n3)
            System.out.println(n2 + " is minimum");
        else
            System.out.println(n3 + " is minimum");
    }
}
