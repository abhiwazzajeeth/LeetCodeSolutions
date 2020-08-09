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
    public int findBottomLeftValue(TreeNode root) {
        int leftMost = root.val;
        Queue<TreeNode> queue = new ArrayDeque<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int level = queue.size();

            while(level > 0) {
                TreeNode current = queue.poll();
                if(level == size ) {
                    leftMost = current.val;
                }                
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
                level--;
            }
        }
        return leftMost;
    }
}
