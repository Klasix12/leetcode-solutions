package Easy;

// https://leetcode.com/problems/range-sum-of-bst/description/
public class RangeSumOfBST {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root.val >= low && root.val <= high) {
            sum = root.val;
        }
        if (root.left != null) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.right != null) {
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
    }
}
