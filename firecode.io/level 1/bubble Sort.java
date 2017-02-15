//implement bubble sort
//Learn OTHER ways to do this.
//My solution. Not the most efficient, but works.
public static int[] bubbleSortArray(int[] arr){
    
    boolean swapped = true;
    //the boolean swapped will dictate if there has been a swap of indexes.
	//that means when the array is completely sorted, it will break out of the while loop
    while(swapped){
		//set the boolean flag to false, so if it is not changed, it will not go through
		//the loop again.
		//not doing this part will cause an infinite loop.
        swapped=false;
		/*
		here is where it becomes inefficient (it already is an inefficient algoritm)
		this makes it more so. It forces the loop to go through the WHOLE array
		EVERY iteration. It could just go up to length-i.
		*/
        for(int i=1; i< arr.length;i++){
            if(arr[i]<arr[i-1]){
				//I di my swap here, rather than in a seperate method, just because
                int temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
				//make sure after there is a swap, the boolean flag is changed to true.
                swapped=true;
            }
        }
    }
    return arr;
}

