package org.ichillous.tests.dsastudy.leetcode;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;


public class Runner {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        removeElement(arr, 3);
    }
    public static int removeElement(int[] nums, int val) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i ; j < nums.length -1; j++) {
                if (nums[i] != nums[j]) {
                    map.put(nums[i], nums[j]);
                } else {

                }
            }
        }
        map.forEach((k, v) -> System.out.println(k + "," + v));
        return map.size();
    }
}
