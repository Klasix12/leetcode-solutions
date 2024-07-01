package Easy;

// leetcode.com/problems/is-subsequence/description
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.equals(t)) return true;
        if (t.length() < s.length()) return false;

        int sIndex = 0;
        int sLength = s.length();
        for (int i = 0; i < t.length(); i++) {
            if (sIndex == sLength) return true;
            if (s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }
        }
        return sIndex == sLength;
    }
}
