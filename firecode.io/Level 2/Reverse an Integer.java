/*
	Reverse an Integer
	Implement a method that reverses an integer - without using additional heap space
	Examples:
	-123 ==> -321
	123 ==> 321
*/

//my Solution 
public static int reverseInt(int x) {
    
    if( x==0 )return x;
    
    int rev = 0;
    while(x!=0){
        rev*=10;
        rev+=x%10;
        x/=10;
    }
    return rev;
}
