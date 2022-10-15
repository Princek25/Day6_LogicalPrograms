package com.bridgelabz.junitprograms;

import java.util.Arrays;

public class SwapNibbles {
    static int[] swapNibbles(int[] arr) {

        // swap nibbles at first and last of the array
        // j is used for saving last 4 index of the array
        int temp, j = arr.length - 4;
        for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element to last four elements
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr2 = {1,0,1,1,0,0,0,1};
        int [] arr3 = swapNibbles(arr2);
        System.out.print(Arrays.toString(arr3));
    }
}
