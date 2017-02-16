/*
	Find a Node in a Binary Tree Without Using Recursion
	
	Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.

	Example:  
		   1              
		  / \            
		 2   3    
		/ \ / \          
	   4  5 6  7         

	findNode(root, 5) ==> 5

	Note: Return null, if desired node is not found.
	
*/

	public TreeNode findNode(TreeNode root, int val) {
		
		if(root==null) return null;
		
		Queue<TreeNode> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()){
			TreeNode current = q.poll();
			if(current.data==val) return current;
			
			if(current.left!=null){
				q.add(current.left);
			}
			
			
			if(current.right!=null){
				q.add(current.right);
			}
			
		}
		
			return null;
	}
	