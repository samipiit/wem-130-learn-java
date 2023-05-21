package learn_advanced.sorting;

import java.util.Arrays;

public class LearnBubbleSort {

    public static void main(String[] args) {
        int[] unsortedArray = {8, 3, 5, 1, 10, 7, 2, 6, 4, 9};

        System.out.println(Arrays.toString(bubbleSort(unsortedArray)));

    }


    static int[] bubbleSort(int[] unsortedArray) {
        int length = unsortedArray.length;
        int temp;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
        return unsortedArray;
    }


}
