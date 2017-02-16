/*
	Delete the Head Node of a Circular Linked List
	
	Given a circular linked list, implement a method to delete its head node. Return the list's new head node.

	*x = indicates head node
	1->2->3->4->*1 ==> 2->3->4->*2
*/

//My solution
public ListNode deleteAtHead(ListNode head) {
        if(head == null) return null;
        if(head.next==head) return null;
        
        //loop until the next node is the head.
        ListNode n=head.next;
        while(n.next!=head){
            n=n.next;
        }
        n.next=head.next;
        head=n.next;
        return head;
    
}
