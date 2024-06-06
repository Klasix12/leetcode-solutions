package Easy;

// https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int res = 0;
        int newX = x;

        while (newX > 0) {
            res = res * 10 + newX % 10;
            newX /= 10;
        }

        return res == x;
    }
}
