package com.ds;

public class Arrays {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

//        bubbleSort(intArray);
        selectionSort(intArray);

        for (int j : intArray) {
            System.out.println(j);
        }

    }

    public static void bubbleSort(int[] array) {

        int length = array.length;
        int temp = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i] < array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {

        int temp = 0;

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int j = 1; j <= lastUnsortedIndex; j++) {
                if (array[j] > array[largest]) {
                    largest = j;
                }
            }
            temp = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = array[largest];
            array[largest] = temp;
        }
    }
}
