package Easy;

// leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.length() > strs[i].length()) {
                prefix = prefix.substring(0, strs[i].length());
            }
            if (prefix.isEmpty()) {
                return "";
            }
            for (int j = 0; j < Integer.min(strs[i].length(), prefix.length()); j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }
        return prefix;
    }
}
