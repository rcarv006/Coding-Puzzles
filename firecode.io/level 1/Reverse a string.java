/*
	Reverse a string

	Write a method that takes in a String and returns the reversed version of the String.
	Examples:
	reverseString("abcde") -> "edcba"
	reverseString("1") -> "1"
	reverseString("") -> ""
	reverse("madam") -> "madam"
	reverse(null) -> null

*/

//my iterative solutions suffer because i don't know or pay attention to where the loop ends

//My solution --- iterative (1) (I tried some tricky stuff)
public static String reverseString(String str){
    String inputString = str;
    String outputString = null;
    
    if(inputString==null|| inputString.length()<=0) return inputString;
    
    outputString="";
    for(int i=0;i< inputString.length();i++){
        outputString=inputString.charAt(i)+outputString;
    }
    
    return outputString;
}

//my Solution -- iterative (2)
public static String reverseString(String str){
    String inputString = str;
    String outputString = null;
    
    if(inputString==null|| inputString.length()<=0) return inputString;
    
    outputString="";
    for(int i=inputString.length()-1;i>=0 ;i--){
        outputString+=inputString.charAt(i);
    }
    
    return outputString;
}

//My solution -- recursive
public static String reverseString(String str){

    if(str==null|| str.length()<=1) return str;
    
    return reverseString(str.substring(1) ) + str.charAt(0);

}
