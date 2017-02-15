
/*
Find the Middle of a List in a Single Pass
Given a Singly-Linked List, write a method - findMiddleNode that finds and returns the middle node of the list in a single pass.

Examples:
1 ==> 1
1->2 ==> 1
1->2->3->4 ==> 2
1->2->3->4->5 ==> 3
*/

//my solution 
//Strategy, move the front pointer 2x and the back pointer 1x every iteration.
//at the end, return the back pointer.
public ListNode findMiddleNode(ListNode head) {

    if(head==null)return null;
        
    ListNode front = head;
    ListNode back = head;
    
    while(front.next!=null){
        front=front.next;
        
        if(front.next!=null && front!=null){
            front=front.next;
            back=back.next;
        }
        
       
    } 
    return back;
}
