/*
	String Compression
	
	Compress a sorted String by replacing instances of repeated characters with the character followed by the count of the character.


	compressString("aaabbbbbcccc") --> a3b5c4
	compressString("aabbbbccc") --> a2b4c3
	compressString("abc") --> abc


	Note: This kind of compression will only be effective when the count of consecutive identical characters is greater than 1.

*/

//My solution
//Another moment where I was getting the wrong answer repeatedly only to realize that it was
//because of something minor I overlooked, like the direction of an inequality sign.
//Or weather the numbers come first or the letters.
public static String compressString(String text) {
    
	//Make a count variable
    int count = 1;
	//a new string
    String compressed ="";
    for(int i=0; i< text.length();i++ ){
    //the trick here is to NOT go out of bounds. That is why you test for i+1 being less //than length
		if( (i+1)<text.length() && text.charAt(i)==text.charAt(i+1) ){
            count++;
        }
        else{
            if(count==1){
                compressed+=text.charAt(i);
            }else{
				//mind the order of the letters and numbers.
                compressed+=text.charAt(i);
                compressed+=count;
                count=1;
            }
        }
    }
    
    return compressed;

}
