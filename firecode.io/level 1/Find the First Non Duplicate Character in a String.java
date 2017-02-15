/*

Find the first non-duplicate character in a string. Return null if no unique character is found. 

firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
firstNonRepeatedCharacter( "cbcd" ) --> 'b'
firstNonRepeatedCharacter( "cdcd" ) --> null
*/


public static Character firstNonRepeatedCharacter(String str) {

	//1. make new hashmap. Structure does not matter.
        HashMap<Character,Integer> charChecker = new HashMap<>();
        
		//2. iterate through string, put in the char, followed by the count.
		//quite normal stuff.
        for(int i=0; i< str.length();i++ ){
            
            if(!charChecker.containsKey(str.charAt(i))){
                charChecker.put(str.charAt(i), 1);
            }else{
                charChecker.put(str.charAt(i), charChecker.get(str.charAt(i))+1);
            }
            
        }

	//3. iterate through the string. For each char, if the value of the map entry
   //for that char is 1, return it. this guarantees the return of the first non-duplicate.
      for(int j=0; j<str.length();j++){
          if(charChecker.get(str.charAt(j))==1 ){
              return str.charAt(j);
          }
      }
      return null;
    }
        
/*my PREVIOUS solution -- does not return FIRST non duplicate character*/
public static Character firstNonRepeatedCharacter(String str) {
	//self explanitory.
		if(str==null) return null;
		if(str.length()==1) return str.charAt(0);
		//1. make an int array to represent the ascii value of the characters.
		int [] characters = new int[256];
		//2.loop through the String and increment the count
		//at the index of the char's ascii value
		for(int i=0; i< str.length();i++){
			characters[(int)(str.charAt(i))]++;
		}
		//3.loop through the ascii character array and if any one has a value of one,
		// return it.
		for(int j =0; j< characters.length;j++){
				if(characters[j]==1){
				return (char) j;
			}
		}
				//else - if nothing is found, return null.
				return null;
	}
