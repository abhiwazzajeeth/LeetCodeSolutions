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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        ArrayDeque<Integer> parentPos= new ArrayDeque<Integer>();
        
        parentPos.add(0);
        
        int leftMin = 0;
        int rightMax = 1;
        int maxWidth = 0;
                
        while(!queue.isEmpty()) {
            int level = queue.size();
            while(level > 0) {
                TreeNode current = queue.poll();
                int pos = parentPos.poll();
            
                if(current.left != null) {
                    queue.add(current.left);
                    parentPos.add(2 * pos);
                }
            
                if(current.right != null) {
                    queue.add(current.right);
                    parentPos.add(2 * pos + 1);
                }
                
                
                level--;
            }
            if(!parentPos.isEmpty())
            maxWidth = Math.max(maxWidth, (parentPos.getLast() - parentPos.peek()));
        }
        return maxWidth + 1;
    }
}
