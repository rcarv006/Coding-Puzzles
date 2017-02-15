/*
Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number. Assume you have 9 numbers between 1 to 10 and only one number is missing.
*/

public static int findMissingNumber(int[] arr) {
	//first get the sum of all the numbers in the array by looping through the array
	//and adding all the numbers. This requires initializing an int variable then
	//adding the value at each index to the variable.
    int sum=0;
	//you CAN use a for each loop on a primitive array.
    for(int i: arr) {
        sum+=i;
    }
	//once you have the sum, return the difference of 55
	//(the sum of all the numbers from 1 - 10) and the sum of the numbers in the array.
    return 55-sum;
    
}