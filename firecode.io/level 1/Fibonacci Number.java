/*The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number is found by adding up the two numbers before it.

Write a recursive method fib(n) that returns the nth Fibonacci number. n is 0 indexed, which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., n == 0 should return 0 and n == 3 should return 2. Assume n is less than 15.

Even though this problem asks you to use recursion, more efficient ways to solve it include using an Array, or better still using 3 volatile variables to keep a track of all required values. Check out this blog post to examine better solutions for this problem.

Examples:
fib(0) ==> 0

fib(1) ==> 1

fib(3) ==> 2
*/

//BLAH BLAH BLAH...
//Make a recursive function  to print the nth number in the fibonacci series.

public static int fib(int n) {

    if(n==0) return 0;
    if(n==1) return 1;
    return fib(n-1) + fib(n-2);
}

/*
	Explination. Since it is put on the stack, backwards, this happens:
	fib(5)== 
	0 gets poped of the stack first.
	then 1
	so 
	fib(0)==0;
	fib(1)==1;
	fib(2)==(fib(1)+fib(0))==1
	fib(3)==(fib(2)+fib(1))==2
	fib(4)==(fib(3)+fib(2))==3
	fib(5)==(fib(4)+fib(3))==5
*/
