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
    public List<Integer> preorderTraversal(TreeNode root) {
        // iterative answer?
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        // pre order is root, left ,right
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){

            TreeNode peek = st.pop();
            ans.add(peek.val);
            if(peek.right!=null){
                st.push(peek.right);
            }
            if(peek.left!=null){
                st.push(peek.left);
            }
        }
        return ans;

    }
}