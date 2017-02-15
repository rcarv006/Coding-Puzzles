/*
	Binary Search on Array of Integers
	Write a method that searches an Array of integers for a given integer using the 
Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
You can assume that the given array of integers is already sorted
in ascending order.
Examples:

binarySearch({2,5,7,8,9},9) -> true

binarySearch({2,8,9,12},6) -> false

binarySearch({2},4) -> false

binarySearch({},9) -> false

   {} -> [Empty] Array
*/

//My solution -- iterative
public static Boolean binarySearch(int[] arr, int n){
    
       if(arr==null) return false;

        int high = arr.length;
        int low = 0;
        
        while(low<high){
            int middle = (low+high)/2;
            
            if(arr[middle]==n ){
                return true;    
                
            }else if(arr[middle]> n ){
                high=middle-1;
            }else{
                low = middle+1;
            }    
        }
        
        return false;

}

//my solution -- recursive
public static Boolean binarySearch(int[] arr, int n){

        return binarySearch(arr, 0, arr.length-1, n);
        
}

private static boolean binarySearch(int [] arr, int low, int high, int n){
    
    if(low>high) return false;
    
    int middle = (low+high)/2;
    
    if( arr[middle]==n ){
         return true;
    }else if(arr[middle]> n ){
        return binarySearch(arr, low, middle-1, n);
    }else{
        return binarySearch(arr, middle+1, high, n);
    }
    
    
}

