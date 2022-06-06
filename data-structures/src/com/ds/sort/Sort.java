package com.ds.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

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

    public static void insertionSort(int[] array) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }

    public static void shellSort(int[] array) {

        for (int gap = array.length / 2; gap > 0; gap/= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }

    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    public static void quickSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[start];
        int left = start;
        int right = end;

        while (left < right) {

            while (left < right && pivot <= array[--right]);
            if (left < right) {
                array[left] = array[right];
            }

            while (left < right && pivot >= array[++left]);
            if (left < right) {
                array[right] = array[left];
            }
        }
        array[left] = pivot;
        return left;
    }

    public static void countingSort(int[] array, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void bucketSort(int[] input) {

        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket: buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value: buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / (int) 10 % 10;
    }
}
