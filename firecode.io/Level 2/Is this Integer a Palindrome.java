/*
	Is this Integer a Palindrome?
	Write a method that checks if a given integer is a palindrome - without allocating additional heap space
	Examples:
	-1 ==> false
	0 ==> true
	1221 ==> true
*/

//My solution
public static Boolean isIntPalindrome(int x) {            

    //why is this?
    if(x<0) return false;
    //make a variable and set it equal to the input
    int y = x;//not good naming conventions :p
    //make an variable that will be reversed int
    int rev = 0;
    //reverse the above
    while(y!=0){
        rev*=10;
        rev+=y%10;
        y/=10;
    }
    
    //compare the reversed int and the input
    return x==rev;

}
