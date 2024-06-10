package Easy;

import java.util.Arrays;

// leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
