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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // do level order traversal thats all
        // based on index change the direction.
        // create a level order and the rever each odd level


        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        queue.add(root);
        int indx=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> sub= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode polled = queue.poll();
                sub.add(polled.val);
                if(polled.left!=null){
                    queue.add(polled.left);
                }
                if(polled.right!=null){
                    queue.add(polled.right);
                }
            }
            if(indx%2==1){
                Collections.reverse(sub);
            }
            ans.add(sub);
            indx++;
        }
        return ans;
    }
}