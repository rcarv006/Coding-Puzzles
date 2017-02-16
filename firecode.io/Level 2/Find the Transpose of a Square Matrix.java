/*
	Find the Transpose of a Square Matrix
	
	You are given a square 2D image matrix where each integer represents a pixel. Write a method transposeMatrix to transform the matrix into its Transpose - in-place. 

	Example:Input image :
	1 0
	1 0 
	Modified to :
	1 1
	0 0
*/

//NOTE: this means  flip across the negative x/y line.

//My solution
public static void transposeMatrix(int[][] matrix) {
    for(int i=0; i< matrix.length;i++){
        for(int j=i+1; j< matrix[0].length; j++){
            int temp = matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
}
