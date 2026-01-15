
public class Cond {
    public static void main(String[] args) {
        // if..else
        int x = 5;
        if(x>2){
            System.out.println("Hi");
        }else if (x<2) {
            System.out.println("Hello");
        }
        else {
            System.out.println("No");
        }

        // ternary operator
        // ?:
        int n =4,m = 2;
        int max = (n>m) ? n : m;
        
        // switch case
        int val = 3;
        switch (val) {
            case 1:
                System.out.println("Mon");
                break;
            case 2: 
                System.out.println("Tue");
                break;
            default:
                System.out.println("fRI");
                break;
        }

        // NEW SWITCH CASE
        String day = "tue";
        String res = switch(day) {
            case "mon" -> "7am";
            case "tue" -> "8am";
        }
    }
}
