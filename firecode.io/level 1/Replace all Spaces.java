/*
	Replace all Spaces
	Write a method to replace all spaces in a string with a given replacement string. 

replace("This is a test","/") --> "This/is/a/test"

Note: Avoid using the in-built String.replaceAll() method. 
*/

//my solution
public static String replace(String a, String b) {
//quite simple. We have a result string. as we iterate through our input string, if we 
//encounter a space, our we concatenate String b to our result string, otherwise, we 
//concatentate whatever char we are at.
    String result = "";
    
    for(int i=0;i< a.length();i++ ){
        if(a.charAt(i)==' '){
            result+=b;
        }else{
            result+=a.charAt(i);
        }
    }
    return result;
}
