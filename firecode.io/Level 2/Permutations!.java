/*
	Permutations!
	
	Implement a method that checks if two strings are permutations of each other. 


	permutation("CAT","ACT") --> true

	permutation("hello","aloha") --> false
*/

/*
	This is sorting and seeing if they are the same. An anegram method.
	
*/

//My Solution - maybe not as effecient as it could be, but it works.
public static boolean permutation(String str1, String str2) {
    if( str1.length()!= str2.length() ) return false;
    
    char [] s1 = str1.toCharArray();
    char [] s2 = str2.toCharArray();
    
    Arrays.sort(s1);
    Arrays.sort(s2);
    
    String result1 = new String(s1);
    String result2 = new String(s2);
    
    return result1.equals(result2);
}

//official firecode.io solution. Still a bit inefficient, but still works
public static boolean permutation(String str1, String str2) {
  if (str1.length() != str2.length()) {
      return false;
  }
      
  int[] letters = new int[256];
  char[] str1_arr = str1.toCharArray();
  // Record all the characters which are in the first string.
  for (char c : str1_arr) {
      letters[c]++;
  }
  // Remove all the characters of second string from records.
  for (int i=0; i<str2.length(); i++) {
      int c = (int) str2.charAt(i);
      // If any character is not found or found more than the number of times 
      // in the second string, strings are not permutation of each other 
      if (--letters[c] < 0) {
          return false;
      }
  }
  return true;
}
