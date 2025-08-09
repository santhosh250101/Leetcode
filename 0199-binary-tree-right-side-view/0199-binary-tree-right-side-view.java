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
    public List<Integer> rightSideView(TreeNode root) {
        
        // do level order traversal,
        // at each level print the right most item.

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> rightView = new ArrayList<>();
        if(root== null){
            return rightView;
        }

        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();

            for(int i=0;i<n;i++){
                TreeNode top = queue.poll();
                if(i == n-1){
                    rightView.add(top.val);
                }
                if(top.left!=null)
                    queue.add(top.left);
                if(top.right!=null)
                    queue.add(top.right);
            }
        }
        return rightView;
    }
}