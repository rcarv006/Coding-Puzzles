/*
	Flip it!
	
	You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its vertical axis.

Example:
Input image :  
              1 0
              1 0 

Modified to :   
              0 1
              0 1
*/
//Need to trace these! 


//my solution
public static void flipItVerticalAxis(int[][] matrix) {
    
    //reverse the rows 
    for(int i=0; i< matrix.length;i++){
        for(int j=0; j<matrix[0].length/2;j++){
            //swap
            int temp = matrix[i][j];
            matrix[i][j]= matrix[i][matrix[0].length-1-j];
            matrix[i][matrix[0].length-1-j]=temp;
        }
    }
    
}

