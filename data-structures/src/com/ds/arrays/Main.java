package com.ds.arrays;

import static com.ds.sort.Sort.bucketSort;

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
        int[] intArray3 = {54, 46, 83, 66, 95, 92, 43, 10};

        bucketSort(intArray3);

        System.out.println(java.util.Arrays.toString(intArray3));
    }
}
