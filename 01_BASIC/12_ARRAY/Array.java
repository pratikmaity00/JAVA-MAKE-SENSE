public class Array {

    public static void main(String[] args) {
        // int num[] = {1,2,3,4,5}; // Not prefered way
        int[] num = {1,2,3,4,5}; // Prefered way

        // System.out.println(num[0]); // -> 1

        num[0] = 7;
        System.out.println(num[0]); // -> 7 not 1


        // String[3] arr;
        // arr[0] = 1;
        // arr[1] = 4;
        // System.out.println(arr[0]);  // not valid synatax in java

        // How to make Dyanamic Array
        int[] arr = new int[3];
        arr[0]  = 12;
        arr[1]  = 15;
        arr[2]  = 19;
        // arr[3]  = 19; // fixed length

        System.out.println(arr[2]);

        String[] arr2 = {"a","b","c","d","e"};
        System.out.println(arr2.length); // 5
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // Throgh foreach loop
        for (String alp : arr2) {
            System.out.println(alp);
        }
    }
}