// { Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        if(root==null) return 0;
        HashMap<Node,Node> parent = new HashMap<>();
        Queue<Node> q= new LinkedList<>();
        Node temp=root;
        Node start=null;
        q.add(temp);
        parent.put(temp,null);
        
        while(!q.isEmpty())
        {
            Node pop=q.poll();
            
            if(pop.left!=null)
            {
                parent.put(pop.left,pop);
                q.add(pop.left);
            }
            if(pop.right!=null)
            {
                parent.put(pop.right,pop);
                q.add(pop.right);
            }
            
            if(pop.data==target)
            {
                start=pop;
            }
        }
        
        // actual logic starts here
        HashSet<Node> visited = new HashSet<>();
        Queue<Node> progress= new LinkedList<>();
        
        progress.add(start);
        visited.add(start);
        int time=0;
        while(!progress.isEmpty())
        {
            int n=progress.size();
            boolean isAdded=false;
            for(int i=0;i<n;i++)
            {
                Node top= progress.poll();
                if(top.left!=null && !visited.contains(top.left))
                {
                    visited.add(top.left);
                    progress.add(top.left);
                    isAdded=true;
                }
                if(top.right!=null && !visited.contains(top.right))
                {
                    visited.add(top.right);
                    progress.add(top.right);
                    isAdded=true;
                }
                if(parent.get(top)!=null && !visited.contains(parent.get(top)))
                {
                    visited.add(parent.get(top));
                    progress.add(parent.get(top));
                    isAdded=true;
                }
                //System.out.println(top.data+" ");
            }
            if(isAdded) time++;
        }
        return time;
        
    }
}