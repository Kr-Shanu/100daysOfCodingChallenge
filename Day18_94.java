import java.util.*;
public class Day18_94{

}
//  * Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public void inorder(TreeNode root, List<Integer> store) {

        if (root == null)
            return;

        inorder(root.left, store);
        store.add(root.val);
        inorder(root.right, store);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
