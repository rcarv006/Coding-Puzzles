/*
Repeated Elements in an Array

Write a method duplicate to find the repeated or duplicate elements in an array. 
This method should return a list of repeated integers in a string with the elements sorted in ascending order (as illustrated below). 


duplicate({1,3,4,2,1}) --> "[1]"

duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"


*/

//My solution
/* 
	a bit longer and less efficient than the one below. 
	A Map which has Integers as keys and the count of how many times they appear in the array as the value.
	iterate through the array, if the element is not in the TreeMap, insert it, with a 1 as the key. If it DOES exist, insert it and increment the value.
	
	Next, make a set with the keys of the map. Iterate through it, and for every key that has a value of 2 or greater, add it to the result ArrayList. Since the map is a treemap, iterateing through it will return things in a sorted form, and insert it in sorted order into the ArrayList.
	Return the ArrayList.toString().
*/
public static String duplicate(int[] numbers){

        ArrayList<Integer> result= new ArrayList<>();
        
        Map<Integer, Integer> dups = new TreeMap<>();
        
        for(int i=0; i< numbers.length;i++){
            if(!dups.containsKey(numbers[i]) ){
                dups.put(numbers[i], 1);
            }else{
                dups.put(numbers[i], dups.get(numbers[i])+1);
            }
        }
        
        Set<Integer> keys = dups.keySet();
        for(Integer i: keys ){
            if( dups.get(i)>1 ){
                result.add(i);
            }
        }

        return result.toString();
}

