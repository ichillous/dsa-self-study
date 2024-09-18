package org.ichillous.tests.dsastudy.Sorting;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        // if a > b
        // a index = b's index
        // 6, 2, 4, 5, 3, 1
        // -> 6 > 2
        // 2, 5, 4, 3, 1, 6
        int[] unsorted = { 5, 4, 3, 2, 1 };
        System.out.println("Unsorted Array -> " + Arrays.toString(unsorted));
        bubbleSort(unsorted);
        System.out.println("Sorted Array -> " + Arrays.toString(unsorted));
    }

    /* ----- BUBBLE SORT ----- */
    /* --> O(1)
         if a > b
         a index = b's index
         6, 2, 4, 5, 3, 1
         -> 6 -> 2
         6 <- 2
         2 -> 6
         2, 6 ....
         2, 5, 4, 3, 1, 6
     */
    public static void bubbleSort(int[] array) {
        for ( int i = array.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j]; // new int temp = value of J
                    array[j] = array[j+1]; // J = j + i
                    array[j+1] = temp; // copies temp to j+ 1
                    // sorting original array
                }
            }
        }
    }

    /* ----- SELECTION SORT ----- */
    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
                if(i != minIndex){
                    int temp = array[j]; // new int temp = value of J
                    array[j] = array[j+1]; // J = j + i
                    array[j+1] = temp;
                }
            }
        }
    }
    /* ----- SELECTION SORT ----- */
    /*
        if (i+1 < i) -> i+1 -> i.
        {2, 1, 4, 3, 5, 6}
        N!n^2
    */
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

}
