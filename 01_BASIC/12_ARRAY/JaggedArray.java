public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[3]; // cols
        arr[1] = new int[4];
        arr[2] = new int[2];

        for(int rows = 0; rows < arr.length; rows++) {
            for(int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = (int) (Math.random() * 10);
            }
        }

        // for(int rows = 0; rows < arr.length; rows++) {
        //     for(int cols = 0; cols < arr[rows].length; cols++) {
        //         System.out.print(arr[rows][cols] + " ");
        //     }
        //     System.out.println();
        // }

        
        
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}