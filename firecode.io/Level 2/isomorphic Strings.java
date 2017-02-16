/*
	Isomorphic Strings
	
	Given two strings - input1 and input2, determine if they are isomorphic. 
	Two strings are isomorphic if the letters in one string can be remapped to get the second string. Remapping a letter means replacing all occurrences of it with another letter. The ordering of the letters remains unchanged. You can also think of isomorphism as it is used in chemistry - i.e. having the same form or overall shape. Target linear time and space complexity with your solution.

	Examples:
	Input 1 : css  
	Input 2 : dll
	Output  : true

	Input 1 : css 
	Input 2 : dle
	Output  : false

	Input 1 : abcabc 
	Input 2 : xyzxyz
	Output  : true

	Input 1 : abcabc 
	Input 2 : xbexyz
	Output  : false
*/

//My solution (much trouble)
public static boolean isIsomorphic(String input1, String input2) {
    
    if(input1.length()!= input2.length() ) return false;
    
    Map<Character, Integer> checki1 =new HashMap<>();
    Map<Character, Integer> checki2 =new HashMap<>();
    
    for(int i = 0; i< input1.length();i++ ){
        if(!checki1.containsKey(input1.charAt(i))){
            checki1.put( input1.charAt(i), 1 );
        }else{
            checki1.put(input1.charAt(i), 
            checki1.get(input1.charAt(i))+1 );
        }
    }
    
    
    for(int j = 0; j< input2.length();j++ ){
        if(!checki2.containsKey(input2.charAt(j))){
            checki2.put( input2.charAt(j), 1 );
        }else{
            checki2.put(input2.charAt(j), 
            checki2.get(input2.charAt(j))+1 );
        }
    }
   
    
    for(int k = 0; k< input1.length();k++ ){
        if( checki1.get(input1.charAt(k))!=checki2.get(input2.charAt(k))){
            return false;
        }
    }
    return true;
}
