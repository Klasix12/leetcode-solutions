package Easy;

import java.util.Arrays;

// leetcode.com/problems/merge-sorted-array/description
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
