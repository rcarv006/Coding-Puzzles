
/*
Write a method that returns a number that appears only once in an array.
Assume the array will surely have a unique value. The array will never be empty.
Examples:

{1,2,3,4,1,2,4,3,5} ==> 5
*/

//The tags say that this is a problem that uses hash tables, so that is the way we will do //it.

  /*
    My previous solution would be as follows:
    
    Make a new array which is large enough (a gamble, to be sure) to contain all The 
    entries of the old array. For each number in the old array, we will increment 
    that index in the new array, and return the only array with 1.
    
    This solution NO LONGER WORKS due to Firecode.io now using negative numbers, 
    which can't be indexed in a standard Array.
    
    For this reason, I will now use a HashTable
    */
	
	/*Also, XORing each element will not work, because it does not say that each duplicate number appears only twice. If a number appears an odd amount of time, XORing will not work.*/
	

	public static int singleNumber(int[] A) {
  //if there is only one element in the array-well, there you go.
  if(A.length==1){
      return A[0];
  }
  
  //Make new Hashtable - it will contain an Int and the count of how many times 
  //that int appears
  Hashtable<Integer, Integer> h = new Hashtable<>();
  
  //put each item into the Hashtable.
  //for duplicate elements, increment the counter.
  for(int i=0; i< A.length;i++){
      if(!h.containsKey(A[i])){
          h.put(A[i], 1);
      }else{
          h.put(A[i], h.get(A[i])+1 );
      }
  }
  
  //make a number variable. This will return the number that appears only once.
    int number = 0;
    
	//make a set of all the keys in a table.
    Set<Integer> nums = h.keySet();

	//iterate through set.
    for(Integer i: nums){
		//if the entry in the set (which is a key in the hashtable)
		//has a value of one, that is your number.
        if(h.get(i)==1){
            number=i;
        }
    }
	//return the number.
    return number;
 }
 
 //my previous solution.
 //no longer works, as the test data now includes negative numbers.
 public static int singleNumber(int[] A) {
		if(A.length==1){
			return A[0];
		}
		
		int [] findSingle = new int[100000];
		for(int i=0; i< A.length;i++){
			findSingle[A[i]]++;
		}
		
		int singleNumber = 0;
		
		for(int k=0; k< findSingle.length; k++){
			if(findSingle[k]==1){
			singleNumber=k;
			}
		}
		
		return singleNumber;
}
 
