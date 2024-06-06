package Easy;


// leetcode.com/problems/remove-element/description
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int res = 0;
        int last = nums.length - 1;

        for (int i = 0; i <= last; i++) {
            if (nums[i] == val) {
                for (int j = last; j >= i ; j--) {
                    last--;
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        res++;
                        break;
                    } else {
                        nums[j] += 1;
                    }
                }
            } else {
                res++;
            }
        }
        return res;
    }
}
