package Medium;

import java.lang.reflect.Array;
import java.util.Arrays;

// leetcode.com/problems/rotate-array/description
public class RotateArray {
    static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
