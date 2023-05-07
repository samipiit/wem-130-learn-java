package learn_basics.data_structures;

public class LearnArrays {

    // Data structures are structures that allows us to organize data and control how that data can be accessed or
    // interacted with

    public static void main(String[] args) {

        /*
        Arrays

        1 - Fixed in size
        2 - Can only hold 1 data type
        3 - In order to access values in an array, we must index into the array
            - Index ALWAYS starts at 0
            - Index is not to be confused with the size/length of the array
            - The max index in any array is ALWAYS size/length - 1
         */

        // Method 1 to declare/init an array
        int[] ages; // Declaration
        ages = new int[6]; // Initialization

        // Method 2 to declare/init an array
//        int[] studentAges = {20, 27, 28, 24, 20};

        // To access/assign values in an array, we must index into the array
        ages[0] = 20;
        ages[1] = 27;
        ages[2] = 28;
        ages[3] = 24;
        ages[4] = 20;

        int max_index = ages.length - 1;
        System.out.println(ages[max_index]); // 20

    }

}
