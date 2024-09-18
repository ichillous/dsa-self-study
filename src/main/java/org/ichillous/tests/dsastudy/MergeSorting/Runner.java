package org.ichillous.tests.dsastudy.MergeSorting;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

    }
    /*
        Space Complexity -> O(n)
        Time Complexity -> (log n)
        Merging it back is O(n)
        O(n log n) : most efficient you can get when sorting.
        it will break the list in half
        until sorted
        [1,3,7,8][2,4,5,6]
        [1,2][3,4][5,7][8,6]
    */
    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }
    /*
      RECURSION ->              [3,1,4,2]
     int[] left = ..->          [3,1][4,2]
    int[] right = ..->          [3] [1] [4] [2]
    return merge(left, right);  [1] [3] (left)
    return merge(left, right);  [2] [4] (left)
    return merge(left, right);  [1] [3] [2] [4] -> [1] [2] [3] [4]
    */
    public static int[] mergeSort(int[] array) {
        if(array.length == 1) return array;
        int midIndex = array.length / 2;
        //          calling itself recursively
        int[] left = mergeSort(Arrays.copyOfRange(array, 0 , midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        return merge(left, right);
    }

}
