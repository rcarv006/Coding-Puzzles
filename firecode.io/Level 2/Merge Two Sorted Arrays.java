/*
	Merge Two Sorted Arrays
	The idea behind the classic Mergesort algorithm is to divide an array in half, sort each half, and then use
	a merge() method to merge the two halves into a single sorted array. 


	Implement the merge() method that takes in 
	two sorted arrays and returns a third sorted array that contains elements of both the input arrays. 

	You can assume
	that the input arrays will always be sorted in ascending order and can have different sizes.


	Examples:

	merge({2,5,7,8,9},{9}) -> {2,5,7,8,9,9}
	merge()({7,8},{1,2}) -> {1,2,7,8}
	merge()({2},{}) -> {2}
	   {} -> [Empty] Array 
*/


//My solution:
// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int[] merge(int[] arrLeft, int[] arrRight){
  
    if(arrLeft.length ==0){
          return arrRight;
      }
    if(arrRight.length==0){
        return arrLeft;
    }
  
  
  int [] merged = new int[arrLeft.length + arrRight.length];
  
 //int len = Math.min(arrLeft.length,arrRight.length);
  
  int leftIndex= 0; 
  int rightIndex=0;
  int mergedIndex=0;
  
  while(leftIndex<arrLeft.length && rightIndex< arrRight.length){
      
      if(arrLeft[leftIndex]<arrRight[rightIndex]){
              merged[mergedIndex]=arrLeft[leftIndex];
              leftIndex++;
              mergedIndex++;
        }else{
            merged[mergedIndex]=arrRight[rightIndex];
            rightIndex++;
            mergedIndex++;
        }
        
  }
        
    while(leftIndex< arrLeft.length){
        merged[mergedIndex]= arrLeft[leftIndex];
        mergedIndex++;
        leftIndex++;
    }
    
    
    while(rightIndex< arrRight.length){
        merged[mergedIndex]= arrRight[rightIndex];
        mergedIndex++;
        rightIndex++;
    }
  

            return merged;
}

//firecode.io solution -notes

        // Grab the lengths of the left and right arrays
        // Create a new output array with the size = sum of the lengths of left and right
        // arrays
        // Maintain 3 indices, one for the left array, one for the right and one for 
        // the merged array
        // While neither array is empty, run a while loop to merge
        // the smaller of the two elements, starting at the leftmost position of 
        // both arrays
        // Another while loop for when the left array still has elements left
        // Another while loop for when the right array still has elements left
//It is so easy when explained this way.

