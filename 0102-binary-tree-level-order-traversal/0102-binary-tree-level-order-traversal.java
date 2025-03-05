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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> sub = new ArrayList<>();
            int n= q.size();
            for(int i=0;i<n;i++){
                TreeNode poll = q.poll();
                sub.add(poll.val);
                if(poll.left!=null) q.add(poll.left);
                if(poll.right!=null) q.add(poll.right);
            }
            ans.add(sub);
        } 
        return ans;
    }
}