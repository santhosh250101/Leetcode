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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int lh= depthTree(root.left);
        int rh = depthTree(root.right);
        if(Math.abs(lh-rh)>1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    public int depthTree(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(depthTree(root.left),depthTree(root.right));
    } 
}