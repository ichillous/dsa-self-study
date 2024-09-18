package org.ichillous.tests.dsastudy.Quicksorting;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] array = { 4,6,1,7,3,2,5};
        int returnedIndex = pivot(array, 0, 6);
        System.out.println("Returned Index - > " + returnedIndex);
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    /*
        O(n log n) <- best case, average case if not sorted
        O(n2) <- worst case if data is sorted
        [4,6,1,3,2,5]
        6 < 1?
        <- 1
        [4,1,6,3,2,5]
        6 < 3?
        <- 3
        [4,1,3,6,2,5]
        ...
        [4,1,2,3,5,6]
        4 < 1?
    */
    public static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }
    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }
    public static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for(int i = pivotIndex + 1; i <= endIndex; i++) {
            if(array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
