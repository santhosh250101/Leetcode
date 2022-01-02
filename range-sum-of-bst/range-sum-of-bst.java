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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root==null) return 0;
        boolean valid=(root.val>=low && root.val<=high);
        return ((valid)?root.val:0) +rangeSumBST(root.left,low,high) +rangeSumBST(root.right,low,high);
    }
}