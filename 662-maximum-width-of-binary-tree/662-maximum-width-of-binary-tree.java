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

class Pair{
    public TreeNode treeNode;
    public int indx;
    Pair(TreeNode treeNode,int indx){
        this.treeNode=treeNode;
        this.indx=indx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        ArrayDeque<Pair> q= new ArrayDeque<>();
        
        if(root==null) return 0;
        
        
        q.add(new Pair(root,0));
        int ans=0;
        
        while(!q.isEmpty()){
            int first =q.peekFirst().indx;
            int last =q.peekLast().indx;
            
            ans=Math.max(ans,last-first+1);
            int n=q.size();
            
            for(int i=0;i<n;i++)
            {
                Pair p = q.poll();
                int index = p.indx;
                
                if(p.treeNode.left!=null)
                {
                    q.add(new Pair(p.treeNode.left,2*index +1));
                }
                if(p.treeNode.right!=null)
                {
                    q.add(new Pair(p.treeNode.right,2* index+2));
                }
                
            }
        }
        return ans;
    }
}