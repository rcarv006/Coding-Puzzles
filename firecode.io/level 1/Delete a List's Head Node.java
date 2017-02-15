/*
Given a singly-linked list, write a method to delete the first node of the list and return the new head.
Example:

LinkedList: 1->2->3 , Head = 1

deleteAtHead(Head) ==> 2->3

*/

//Quick and easy. 

public ListNode deleteAtHead(ListNode head) {
     //the usual check. MUST BE DONE ON ALL LINKED LIST QUESTIONS! 
    if(head==null) return null;
    
	//increment the head pointer. Don't worry if the next node is null.
    head=head.next;
	//return the new head.
    return head;
    
}
  //this video says my way is close to the correct way,
  //https://www.youtube.com/watch?v=wEWYzkOHbXI
  