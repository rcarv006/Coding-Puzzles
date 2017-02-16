/*
	Binary Representation
	
	Write a method to compute the binary representation of a positive integer. The method should return a string with 1s and 0s. 

	computeBinary(6) ==> "110"
	computeBinary(5) ==> "101"

	Note: Use the minimum number of binary digits needed for the representation (Truncate unnecessary trailing 0s).
	computeBinary(5) ==> "0101" (incorrect)
	computeBinary(5) ==> "101" (correct)

*/

//My solution. It is important I be able to trace these on the stack
//do a recursive trace to see if the numbers come out backwards of forward
public static String computeBinary(int val) {
    
    if(val==0) return "0";
    if(val==1) return "1";
    
    if(val%2==0){
        return computeBinary(val/2)+ "0";
    }else{
        return computeBinary(val/2)+ "1";
    }
    
}

//My solution -- iterative
public static String computeBinary(int val) {
     
     if(val==0) return "0";
     if(val==1) return "1";
     
     String result="";
    while(val>0){
        //if zero or even
        if(val==0|| val%2==0){
            result="0"+result;
            //otherwise
        }else {
            result="1"+result;
        }
        
        val=val/2;
    }
    return result;
}

//Firecode.io Solution
public static String computeBinary(int val) {
    // Base case: value is less than 2
    if (val < 2)
      return Integer.toString(val);
    // Recursive case: binary rep = binary of the header + last digit (odd/even)
    else {
      return computeBinary(val/2)+computeBinary(val%2);
    }
  }
 
 //top voted
 public static String computeBinary(int val) {
    // Add your code below this line. Do not modify any other code.
    if (val == 0) return "0";
    
    StringBuilder binStr = new StringBuilder();
    while (val > 0) {
        binStr.insert(0, val & 1);
        val = val >> 1;
    }

    return binStr.toString();
 }
 