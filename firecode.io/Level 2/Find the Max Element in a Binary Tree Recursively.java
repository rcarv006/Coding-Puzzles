/*
	Find the Max Element in a Binary Tree Recursively
	
	Given a binary tree, write a recursive method to return the maximum element.
	Examples:  
		 1                
		/ \             
	   2   3     ==>  7
	  / \ / \           
	 4  5 6  7 
*/

/* NOTE: It says a Binary Tree, NOT a Binars *Search* Tree */


//My solution 
public int findMax(TreeNode root) {
        
        if(root==null) return 0;
        
        int lft = findMax(root.left);
        int rght = findMax(root.right);
        
        
        return Math.max(root.data, Math.max( lft, rght) );

}
//Me -  using in order traversal
	 void findMinMax(Node root){
			
			if(root == null)
				return;
			
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			
			int min=10000;
			int max=0;
			
			while(!queue.isEmpty()){
		      Node tempNode = queue.poll();
					if(tempNode.key>max)
						max=tempNode.key;
					if(tempNode.key<min)
						min=tempNode.key;
					
				     if(tempNode.left!=null)
						queue.add(tempNode.left);
				     if(tempNode.right!=null)
						queue.add(tempNode.right);
				}
				System.out.println("The maximum value of the tree is "+max);
				System.out.println("The minimum value of the tree is "+min);
		}
		
		// Max will the Max(root, max element in left subtree, max element in right
	// subtree)
	public int getMax(Node root) {
		if (root != null) {
			return max(root.data, getMax(root.left), getMax(root.right));
		}
		return 0;
	}
	
	
 
 