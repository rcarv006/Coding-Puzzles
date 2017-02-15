/*
	Horizontal Flip
	
	You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.

Example:

Input image :  
              1 1
              0 0 
Modified to :   
              0 0
              1 1

*/

//My solution
public static void flipHorizontalAxis(int[][] matrix) {
    //reverse the columns
    for(int i=0; i< matrix.length/2;i++){
        for(int j=0; j<matrix[0].length;j++){
            
            int temp = matrix[i][j];
            matrix[i][j]=matrix[matrix.length-1-i][j];
            matrix[matrix.length-1-i][j]=temp;
               
        }
    }
}
