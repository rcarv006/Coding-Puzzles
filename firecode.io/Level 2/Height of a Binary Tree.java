/*
	Height of a Binary Tree
	
	Given a binary tree, write a method to find its height recursively. An empty tree has a height of 0.
	Example:  
		 1
		/ \
	   2   3     ==> height=3
	  / \ / \
	 4  5 6  7 
*/

//My solution. 
public int findHeight(TreeNode root) { 
    
    if(root==null) return 0;
    if(root.left==null && root.right==null) return 1;

    return 1 + Math.max(findHeight(root.left), findHeight(root.right) );

}
/*
	From the hints:
	
	Hint 1:
	Height of a binary tree is the number of nodes in the longest path from the root to its deepest node.
	
	Hint 2:
	The key here is to find the depth of left and right subtrees.
	Height of the binary tree will be the maximum of the two heights plus one, to account for the root.

	Hint3:
	This feels like cheating...:
	1. If the root is null, return 0.

	2. Find the height of the left subtree by calling findHeight(root.left).

	3. Find the height of the right subtree by calling findHeight(root.right)

	4. Compare the two heights and return the maximum of the two (after adding 1 to account for the root node).
		
*/


