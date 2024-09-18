package org.ichillous.tests.dsastudy.Heaps;

public class Runner {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(75);
        heap.insert(54);
        heap.insert(100);
        System.out.println(heap.getHeap());
        heap.remove(100);
        System.out.println(heap.getHeap());

        int[] nums1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        System.out.println("Test case 1:");
        System.out.println("Expected output: 7");
        System.out.println("Actual output: " + findKthSmallest(nums1, k1));
        System.out.println();

        // Test case 2
        int[] nums2 = {2, 1, 3, 5, 6, 4};
        int k2 = 2;
        System.out.println("Test case 2:");
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + findKthSmallest(nums2, k2));
        System.out.println();

        // Test case 3
        int[] nums3 = {9, 3, 2, 11, 7, 10, 4, 5};
        int k3 = 5;
        System.out.println("Test case 3:");
        System.out.println("Expected output: 7");
        System.out.println("Actual output: " + findKthSmallest(nums3, k3));
        System.out.println();
    }
    public static int findKthSmallest(int[] nums, int k) {
       Heap heap = new Heap();
       int smallest = 0;
       for (int i = 1; i < nums.length - 1 - 1; i++) {
           heap.insert(nums[i]);
           for (int j = i + 1; j < nums.length - 1 -1; j++) {
               if (nums[i] < nums[j]) {
                   heap.swap(i, j);
               }
           }
           smallest = nums[nums.length -3];
       }
       return smallest;
    }
}
