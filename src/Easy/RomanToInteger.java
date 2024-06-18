package Easy;

// leetcode.com/problems/roman-to-integer/description
public class RomanToInteger {
    public int romanToInt(String s) {
        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sts = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int result = 0;
        for (int i = 0; i < sts.length; i++) {
            while (s.startsWith(sts[i])) {
                result += nums[i];
                s = s.substring(sts[i].length());
            }
        }
        return result;
    }
}
