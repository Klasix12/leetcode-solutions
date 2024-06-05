package Easy;

import java.util.ArrayList;

// leetcode.com/problems/leaf-similar-trees/description
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        getLastNodeValue(root1, list1);
        getLastNodeValue(root2, list2);
        return list1.equals(list2);
    }

    private void getLastNodeValue(TreeNode root, ArrayList<Integer> list) {
        if (root.right == null && root.left == null) {
            list.add(root.val);
        }
        if (root.right != null) {
            getLastNodeValue(root.right, list);
        }
        if (root.left != null) {
            getLastNodeValue(root.left, list);
        }
    }
}
