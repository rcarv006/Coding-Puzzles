/*
	Max Gain
	
	Given an array of integers, write a method - maxGain - that returns the maximum gain. Maximum Gain is defined as the maximum difference between 2 elements in a list such that the larger element appears after the smaller element. If no gain is possible, return 0.
	
*/

//My solution
public static int maxGain(int[] a) {
        
    int gain = 0;
    int min = a[0];
    
    for(int i=0; i< a.length;i++){
        if(a[i]< min){
            min=a[i];
        }
        if(a[i]-min> gain){
            gain =a[i]-min;
        }
    }
    
    return gain;

}
