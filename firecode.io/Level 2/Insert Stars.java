/*
	Insert Stars 
	Given a string, recursively compute a new string where the identical adjacent characters in the original string are separated by a "*".

	Examples:
	insertPairStar("cac") ==> "cac"

	insertPairStar("cc") ==> "c*c"
*/

//My solution
public static String insertPairStar(String s) {
   
    if(s == null) return null;
     if(s.length()<=1) return s;
    if( s.charAt(0)==s.charAt(1) ){
        return s.charAt(0)+"*"+insertPairStar(s.substring(1));
    }else{
        return s.charAt(0)+insertPairStar(s.substring(1));
    }
}
