/*
	POW!
	
	Write a method - pow(x,n) that returns the value of x raised to the power of n (xn). n can be negative!

	Examples:
	pow(2,3) ==> 8.0
*/

//My (recursive) solution.
public static double pow(double x, int n) {
              
    if( n==0 ) return 1;
    
    if(n<0) return 1/(pow(x,-n));
    return x* pow(x,n-1);

}
//my (iterative) solution 
public static double pow(double x, int n) {
 int result= 1;
    if(n==0) return 1;
    if(n==-1) return 1/x;
    
    if(n>0){
        while(n>0){
           result*=x;
            n--;
        }    
    }else{
        n=-n;
        while(n>0){
            result*=x;
            n--;
        }
        result=1/result;
    }
        return result;
}

//check it out! I was not getting a good result because I had declared
//my result variable as an int rather than a double. Need to pay more attention
public static double pow(double x, int n) {
 double result= 1;
    if(n==0) return 1;
    
    if(n>0){
        while(n>0){
           result*=x;
            n--;
        }    
    }else{
        n=-n;
        while(n>0){
            result*=x;
            n--;
        }
        result=1/result;
    }
        return result;
}
