/*
	Power of 2
	
	Write a method - isPowOfTwo to test whether or not a given positive integer is a power of 2. Your method should run in constant O(1) time and use O(1) space.


	Examples: 

	isPowOfTwo(5) ==> false
	isPowOfTwo(8) ==> true
*/

//My solutions

/* 
	1. Bit manipulation.
	since any power of 2 is a 1 followed by all zeros, and any power of 2 minus 1 is just a zero followed by all ones, (2^n is 1 followed by n zeros. (2^n)-1 is a zero followed by n ones), then by anding the two, I will get a zero. so - 2^3 is 1000 where as (2^3)-1 is 0111 so 1000 & 0111 - 0000
	Same principle
	
	___NOTE:___ This is the correct Solution, since the problem statement says it should be in *constant* time.
*/
public static boolean isPowOfTwo(int num) {
    return( num & (num-1))==0;
}

/*
	Since any power of 2 is just a 1 followed by n number of zeros, then 1 is a power of 2,
	and so is 10, 100000,  1000000000000, etc. All these numbers have only one one bit in it.
	the Integer.bitCount(int) method returns the number of 1 bits. We are looking for a number that has only 1 1 bit.
*/
public static boolean isPowOfTwo(int num) {
    return (Integer.bitCount(num))==1;
}


/*
	Here, we are just converting it to binary string and making sure only the leading bit is a 1.
	Remember, this is now a string, so you should use charAt(i) and other methods of string manipulation.
*/

public static boolean isPowOfTwo(int num) {
    String bitString = Integer.toBinaryString(num);
    for(int i=bitString.length()-1; i>0; i--){
        if( bitString.charAt(i)!='0' ){
            return false;
        }
    }
    
    return bitString.charAt(0)=='1';
}

/*
	A recursive method. 1 is a power of 2 (2^0) and all other numbers are even.
	If you take a power of 2 and keep dividing it by 2, eventually, it will become a 1.
	If it becomes ANY OTHER odd number, it is NOT a power of 2.
*/
public static boolean isPowOfTwo(int num) {
        if(num ==1) return true;
        
        if(num%2==0){
            return isPowOfTwo(num/2);
        }else{
            return false;
        }
}
