/*
	BST Validation
	
	Given the root node of a Binary Tree, determine if it is a Binary Search Tree.

	Examples:

	  
			  20
			/   \
		  15    30
		 /  \
		14  18     

		output ==> true

			  20
			 /   \
		   30    15 
		  /  \                           
		 14  18     

	   output ==> false
*/
//My solution-- problem came because I did not know how to pass max/min values recursively
//so I had to make a helper method, and I did not know to use Integer.Max_Value instead of
//Integer.max_int (which apperantly does not exist.)

public static boolean validateBST(TreeNode root) {
 
 return validateBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
}

public static boolean validateBST(TreeNode node, int high, int low ) {
    
    if(node == null) return true;
    
    if(node.data> high || node.data< low){
        return false;
    }
    
    return (validateBST(node.left, node.data, low)
    && validateBST(node.right, high, node.data));

}