

public class Loop {
    public static void main(String[] args) {
        // while loop
        // int i = 1;
        // while ((i<6)) {
        //     System.out.println("Hi" + i);
        //     int j = 1;
        //     while (j<4) {
        //         System.out.println("java" + j);
        //         j++;
        //     }
        //     i++;
        // }

        // do while loop
        // int i = 1;
        // do{
        //     System.out.println("Hi" + i);
        //     i++;
        // }while(i>5);


        // for loop
        for(int i = 10; i>=0;i--){
            System.out.println(i);
        }

        for(int i = 1; i<6; i++){
            System.out.println("DAY" + i);
            for(int j=1; j<9; j++){
                System.out.println(" " + (j+8) + "-" + (j+9));
            }
        }
    }
}
