/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, "");
    }
    
    public int dfs(TreeNode root, String dir) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null && dir.equals("left")) {
            return  root.val;
        }
        return dfs(root.left, "left") + dfs(root.right, "");
    }
}
