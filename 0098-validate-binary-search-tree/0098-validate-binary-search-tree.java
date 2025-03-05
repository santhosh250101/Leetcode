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
    public boolean isValidBST(TreeNode root) {
        
        // -INF to root , root to Infinity

        if(root== null) return true;

        return isValid(root.left,Long.MIN_VALUE,root.val) && isValid(root.right,root.val,Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root,long left,long right){
        if(root==null) return true;
        int data = root.val;
        if(data>left && data<right){
            return isValid(root.left,left,data) && isValid(root.right,data,right);
        }
        return false;
    }
}