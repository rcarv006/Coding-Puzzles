/*
	Couple Sum
	Given an array of integers, find two numbers such that they sum up to a specific target.
	The method coupleSum should return the indices of the two numbers in the array, where index1 must be less than index2. 
	Please note that the indices are not zero based, and you can assume that each input has exactly one solution. Target linear runtime and space complexity.

	Example:
	Input Array : {2, 3, 4, 7}  
	Target      : 7
	Output      : {2, 3}

*/

//My solution 
public static int[] coupleSum(int[] numbers, int target) {
    
    Map<Integer,Integer> pairs = new HashMap<>();
    int[] result = new int[2];
    
    for(int i=0; i< numbers.length;i++){
        if(pairs.containsKey(target-numbers[i])){
            result[0]=pairs.get(target-numbers[i]);
            result[1]=i+1;
            
        }else{
            pairs.put(numbers[i],i+1);
        }
    }
    
    return result;
}
