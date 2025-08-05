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
    public int diameterOfBinaryTree(TreeNode root) {
        // Diameter of a binary Tree!
        // diamamter of a node = Max(ldiameter, rdiameter, 1+lh+rh)

        if(root == null){
            return 0;
        }

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        int lh = height(root.left);
        int rh = height(root.right);


        return Math.max(leftDiameter, Math.max(rightDiameter, lh+rh));
    }

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }
}