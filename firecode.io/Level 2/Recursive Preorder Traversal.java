/*
	Recursive Preorder Traversal
	
	Given a binary tree, write a method to recursively traverse the tree in the preorder manner. Mark a node as visited by adding its data to the list - Arraylist <Integer> preorderedList.
	Example:  
		 1
		/ \
	   2   3     ==> 1245367
	  / \ / \
	 4  5 6  7 
	
*/


//my solution -- basic pre-order traversal where you add to list at every node.
//Populated the elements of the tree  in the below list in preorder format
ArrayList<Integer> preorderedList = new ArrayList<Integer>();
public void preorder(TreeNode root) {
   if(root==null) return;
    preorderedList.add(root.data);
    preorder(root.left);
    preorder(root.right);
}
