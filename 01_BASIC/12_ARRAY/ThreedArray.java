public class ThreedArray {
    public static void main(String[] args) {
         int[][][] arr = new int[2][3][4];

        // store values
        for(int i = 0; i < arr.length; i++) {          // layers
            for(int j = 0; j < arr[i].length; j++) {   // rows
                for(int k = 0; k < arr[i][j].length; k++) { // cols
                    arr[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        // print values
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Layer " + i);
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
