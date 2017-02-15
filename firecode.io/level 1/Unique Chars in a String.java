/*
	Unique Chars in a String
	Write a method that takes in an input String and returns true if all the characters in the String are unique and false if there is even a single repeated character.
	The method should return true if the input is null or empty String.

	Examples: 
	areAllCharactersUnique("abcde") -> true


	areAllCharactersUnique("aa") -> false


	areAllCharactersUnique("") -> true


	areAllCharactersUnique(null) -> true
*/

//my solution
 
public static boolean areAllCharactersUnique(String str){
    if(str==null || str.length()<=1) return true;
    //ran into trouble because my original solution had the inequality reversed,
	//so all strings under 128 in length returned false. SMH!
	if(str.length()>128 ) return false;
    
      boolean [] containsChar = new boolean[128];
      
      for(int i=0; i< str.length();i++){
          if(containsChar[(int)(str.charAt(i))]==true){
              return false;
          }else{
              containsChar[(int)(str.charAt(i))]=true;
          }
      }
    
    return true;
}