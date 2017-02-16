/*
	Even or Odd?
	
	Given a singly-linked list, check whether its length is even or odd in a single pass. An Empty list has 0 nodes which makes the number of nodes in it even.
Examples:
1->2->3->4 == true 1->2->3->4->5 == false
*/

//I have trouble with these because I am not solid on LinkedList iteration. 
//I need to get better at these.

//My solution -- cheap, brute force using a counter. I can Do BETTER.
public Boolean isListEven(ListNode head) {
    
    if(head==null) return true;
    if(head.next == null) return false;
    
    
    int count = 0;
    for(ListNode p=head; p!=null;p=p.next){
        count++;
    }
    
    return count%2==0;
}

/*Clues from the problem discription*/
/*
	Traversing over the linked list with 2x the speed (over two nodes at a time) in a loop can give you an interesting and efficient solution in a single pass.
	
	1. Traverse through the List by hopping two Nodes at a time.

	2. While traversing, keep a check to exit out of loop, if the next reference of the current Node becomes null.

	3. If the current Node becomes null at the end of List traversal, it's length is even. Otherwise, it's odd.
*/

//My new Solution:
public Boolean isListEven(ListNode head) {
    
    if(head==null) return true;
    if(head.next == null) return false;
    
    
    
    ListNode p=head; 
    //I traverse the list 2 nodes at a time. I break if either my pointer is null
	//or the pointer's next node is null.
    while(p!=null && p.next!=null){
         p=p.next.next;
    }
    
	//at the end of the loop, if I am null, that means the list is even.
	//else, it means the list is odd.
    if(p==null){
        return true;
    }else{
        return false;
    }
    
}
