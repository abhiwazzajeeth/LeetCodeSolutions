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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        calcSum(root, 0, sum);
        return flag;
    }
    
    public void calcSum(TreeNode node, int calculatedSum, int sum) {
        if(node.left == null && node.right == null) {
            if(sum == calculatedSum + node.val) {
                flag = true;
            }
            return;
        }
        if(node.left != null) {
            calcSum(node.left, calculatedSum + node.val, sum);
        }
        if(node.right != null) {
            calcSum(node.right, calculatedSum + node.val, sum);
        }
    }
    
    
}
