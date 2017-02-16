/*
		Delete the Node at a Particular Position in a Linked List
		
		Given a singly-linked list, implement a method to delete the node at a given position (starting from 1 as the head position) and return the head of the list. Do nothing if the input position is out of range.

		Examples:

		LinkedList: 1->2->3->4 , Head = 1

		deleteAtMiddle(Head,3) ==> 1->2->4
*/

/*
	MY solution
	this is sloppy.
	Ideally, this would be broken into cases:	
	1. Delete the head
	2. Delete the tail
	3. The position is bigger than the list
	4. Delete in the middle
	5. Head is null
	This way, I can use ALL the things I already know how to do -- delete head, delete tail, etc.
	
*/
public ListNode deleteAtMiddle(ListNode head, int position) {
        
    if( head==null) return null;
    if( position==1){
        head=head.next;
        return head;
    }
    
    ListNode c =head;//current node.
    ListNode p = null;//previous node.
    
    while(c!=null && position>1){
        p=c;
        c=c.next;
        position--;
    }
    
    if( position>1){
      return head;   
    }else{
        
    }
    
    p.next = c.next;
    return head;

}

