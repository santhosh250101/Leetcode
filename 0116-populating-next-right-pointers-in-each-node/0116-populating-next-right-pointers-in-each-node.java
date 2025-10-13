/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        //do level order traversal;
        if(root==null) return root;
        Queue<Node> queue = new LinkedList<>();
        Node temp = root;
        queue.add(temp);
        while(!queue.isEmpty()){
            int n= queue.size();
            List<Node> subList = new ArrayList<>();
            for(int i=0;i<n;i++){
                Node top = queue.poll();
                subList.add(top);
                if(top.left!=null) queue.add(top.left);
                if(top.right!=null) queue.add(top.right);
            }

            for(int i=1;i<subList.size();i++){
                subList.get(i-1).next = subList.get(i);
            }
        }
        return root;


    }
}