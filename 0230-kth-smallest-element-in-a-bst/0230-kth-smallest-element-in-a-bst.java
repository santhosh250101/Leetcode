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
    public static List<Integer> ans = new ArrayList<>();
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        ans.add(root.val);
        inOrder(root.right);

    }
    public int kthSmallest(TreeNode root, int k) {
        ans = new ArrayList<>();
        inOrder(root);
        return ans.get(k-1);
    }
}