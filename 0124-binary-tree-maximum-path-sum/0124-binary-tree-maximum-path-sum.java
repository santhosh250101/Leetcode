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
    public static int ans =0;
    public int maxPathSum(TreeNode root) {
        ans =Integer.MIN_VALUE;
        path(root);
        return ans;
    }
    public int path(TreeNode root){
        if(root == null){
            return 0;
        }
        int lp = Math.max(path(root.left),0);
        int rp = Math.max(path(root.right),0);

        ans = Math.max(ans,root.val+ lp+rp);
        return root.val + Math.max(lp,rp);
    }
}