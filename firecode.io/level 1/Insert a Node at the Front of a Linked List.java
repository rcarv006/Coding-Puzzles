/*
Write a method to insert a node at the front of a singly-linked list and return the head of the modified list.
*/

public ListNode insertAtHead(ListNode head, int data) {
//We create a new node.
        ListNode node = new ListNode(data);
//If head is not null, then our node's next points to the current head.        
        if(head!=null){
            node.next = head;
        }
 //our node is the new head       
        head=node;
		//we return the head
        return head;
}
