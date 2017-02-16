/*
	Anagrams
	
	Write a method isAnagram that checks if two lowercase input Strings are anagrams of each other. An anagram of a String is a String that is formed by simply re-arranging its letters, using each letter exactly once. Your algorithm should run in linear O(n) time and use constant O(1) space. 

	Examples:

	isAnagram("abc","cab") => true
	isAnagram("b","b") => true
	isAnagram("bd","cb") => false
*/

/*
    Important note:
    O(1) space means that the memory required by the algorithm is constant, 
    i.e. does not depend on the size of the input. 
    O(n) space means that the memory required by the algorithm has 
    (in the worst case) the same order of magnitude as the size of the input.
    
    In other words, you CAN use an array, or hashtable or map.
    It just can't expand depending on input.
*/

//My solution
public static boolean isAnagram(String input1, String input2) {
    
    if(input1==null || input2==null){
        return false;
    }
    
    int [] chars = new int[256];

    for(int i=0; i< input1.length();i++){
        chars[ (int)(input1.charAt(i)) ]++;
    }
    
    
    for(int j=0; j< input2.length();j++){
        chars[ (int)(input2.charAt(j)) ]--;
    }
    
    for(Integer b: chars){
        if(b!=0){
            return false;
        }
    }
    
    return true;
}
