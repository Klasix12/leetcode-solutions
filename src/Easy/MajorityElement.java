package Easy;

import java.util.HashMap;

// leetcode.com/problems/majority-element
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> n = new HashMap<>();
        for (int num : nums) {
            if (n.containsKey(num)) {
                n.put(num, n.get(num) + 1);
            } else {
                n.put(num, 1);
            }
        }
        int max = 0;
        int maxValue = 0;
        for (int key : n.keySet()) {
            if (n.get(key) > maxValue) {
                max = key;
                maxValue = n.get(key);
            }
        }
        return max;
    }
}
