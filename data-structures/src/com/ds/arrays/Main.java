package com.ds.arrays;

import static com.ds.sort.Sort.bubbleSort;
import static com.ds.sort.Sort.countingSort;
import static com.ds.sort.Sort.insertionSort;
import static com.ds.sort.Sort.quickSort;
import static com.ds.sort.Sort.selectionSort;
import static com.ds.sort.Sort.shellSort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int[] intArray2 = {2, 5, 9, 103, 2, 8, 7, 10, 4, 100};

        bubbleSort(intArray);
        selectionSort(intArray);
        insertionSort(intArray);
        shellSort(intArray);
        quickSort(intArray, 0, 7);
        countingSort(intArray2, 1, 105);

        System.out.println(java.util.Arrays.toString(intArray2));
    }
}
