package org.ichillous.tests.dsastudy;

import java.lang.reflect.Array;
import java.util.*;

public class MergeSortedArr {
    public static void main(String[] args) {
        int[] a = { 1,2,3,1,0,0 };
        int[] b = { 2,5,6};
        merge(a, 3,b, 3);
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // combine, sort, pop
        int i = m - 1;  // Pointer for the last element in nums1
        int j = n - 1;  // Pointer for the last element in nums2
        int k = m + n - 1;  // Pointer for the last position in nums1

        // Merge nums1 and nums2 from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them over
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
        return nums1;
    }
}
