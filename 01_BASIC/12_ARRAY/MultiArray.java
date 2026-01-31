public class MultiArray {
    public static void main(String[] args) {
        // 2D Array
        int[][] nums1 = { {1, 4, 2}, {3, 6, 8} };
         for (int[] row : nums1) {          // each row is a 1D array
            for (int value : row) {      // each element in the row
                System.out.print(value + " ");
            }
            System.out.println();
        }


        int[][] nums2 = new int[3][4];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                nums2[i][j] = (int) (int)(Math.random() * 10);
                // System.out.println(nums2[i][j]);
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
