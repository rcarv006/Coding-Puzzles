/*
	Given a singly-linked list, write a method to delete its last node and return the head.
	Example:
	1->2->3->4 ==> 1->2->3
*/

public ListNode deleteAtTail(ListNode head) {
        
    //if head==tail, delete it.
    if(head==null || head.next==null) return null;
    
    //recurse list until we find the last node, and delete it.
    
    ListNode c = head;//current node 
    ListNode p =null; //previous node
    
    while(c.next!=null){
        p=c;
        c=c.next;
    }
    
    p.next=null;
    return head;
    
    
}