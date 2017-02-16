
/*
	Iterative Preorder Traversal 
	
	Given a binary tree, write a method to iteratively traverse the tree in the preorder manner. Mark a node as visited by adding its data to a list - Arraylist <Integer> preorderedList. Return this list.

	Example:  
		 1
		/ \
	   2   3     ==> 1245367
	  / \ / \
	 4  5 6  7 


*/

public ArrayList<Integer> preorderItr(TreeNode root) {
    
    ArrayList<Integer> nodeData = new ArrayList<>();
    //I may not need this check even.
    if(root == null) return nodeData;
    
    Stack<TreeNode> nodes = new Stack<>();
    
    nodes.push(root);
    
        while(!nodes.isEmpty()){
            TreeNode currentNode = nodes.pop();
            nodeData.add(currentNode.data);
            
            if(currentNode.right!=null){
                nodes.push(currentNode.right);
            }
            
            
            if(currentNode.left!=null){
                nodes.push(currentNode.left);
            }
    
        }
        return nodeData;
    }
