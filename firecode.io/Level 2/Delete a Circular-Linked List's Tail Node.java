/*
	Delete a Circular-Linked List's Tail Node
	
	Given a circular-linked list, write a function to delete its tail node and return the modified list's head.	
	*x = indicates head node
	1->2->3->4->*1 ==> 1->2->3->*1
*/

//AWESOME! I understand the concept, I just keep missing a "Do it right the first time" 
//because I get careless and don't pay attention to calling the wrong variable or 
//to using = instead of ==

//My solution
public ListNode deleteAtTail(ListNode head) {
    //the usual checks
    if(head== null || head.next==head) return null;
    
    ListNode pntr = head;
//loop through list until pntr.next.next=head. At this point, you are BEHIND the tail 
    while(pntr.next.next!=head){
        pntr=pntr.next;
    }
    //we are now behind the tail.
	//We set our next to point to the head, thereby dereferencing the tail.
    pntr.next=head;
    return head;

}
