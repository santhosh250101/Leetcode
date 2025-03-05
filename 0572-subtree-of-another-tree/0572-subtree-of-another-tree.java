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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // pre order it and find isSameTree

        return preorder(root,subRoot);
    }
    public boolean preorder(TreeNode root, TreeNode subRoot){

        if(root == null){
            return false;
        }

        if(isSame(root,subRoot)){
            return true;
        }
        return isSame(root.left,subRoot) || isSame(root.right,subRoot);
    } 
    public boolean isSame(TreeNode r1, TreeNode r2){
        if(r1== null && r2== null) return true;
        if(r1==null || r2==null) return false;
        if(r1.val!=r2.val) return false;

        return isSame(r1.left,r2.left) && isSame(r1.right,r2.right);
    }
}