package Easy;

// leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description
public class IndexOfFirstOccurrence {
    /*
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    */

    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                if (i + needle.length() > haystack.length()) {
                    return -1;
                }
                for (int j = 0; j < needle.length(); j++) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        break;
                    }
                    if (needle.length() - 1 == j) {
                        return i;
                    }

                }
            }
        }
        return -1;
    }
}
