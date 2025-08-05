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
        traverse(root);
        return ans;
    }

    public int traverse(TreeNode root){
        if(root ==null){
            return 0;
        }

        int ltraverse = Math.max(traverse(root.left),0);
        int rtraverse = Math.max(traverse(root.right),0);
        ans = Math.max(ans,root.val + ltraverse+ rtraverse);
        return root.val + Math.max(ltraverse,rtraverse);
    }
}