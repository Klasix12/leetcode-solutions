package Easy;

// leetcode.com/problems/length-of-last-word/description
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int res = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) != ' ') {
                res++;
            }
            if (s.charAt(i) == ' ' && res > 0) {
                return res;
            }
        }
        return res;
    }
}
