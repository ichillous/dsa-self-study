package org.ichillous.tests.dsastudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] a = { 1,1,2 };
        removeDuplicates(a);
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int arrSize = set.size();
        set.stream().forEach(i -> System.out.print(i + " "));
        System.out.println("<- Array\n");
        System.out.println(arrSize + " <- arr size");
        return set.size();
    }
}
