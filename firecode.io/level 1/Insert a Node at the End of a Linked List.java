//Good reading on linked list and recursion
//http://www.ics.uci.edu/~pattis/ICS-21/lectures/llrecursion/lecture.html

/*
	Insert a Node at the End of a Linked List
	
	Write a method to insert a node at the end of a singly-linked list. Return the head of the modified list.
	Examples:

	LinkedList: 1->2 , Head = 1

	InsertAtTail(Head,1) ==> 1->2->1
	InsertAtTail(Head,2) ==> 1->2->2
	InsertAtTail(Head,3) ==> 1->2->3
*/

public ListNode insertAtTail(ListNode head, int data) {
    
    ListNode newNode = new ListNode(data);
    //list has no nodes
    if(head == null){
        head = newNode;
        return head;
    }
    //list has 1 node
    if(head.next ==null){
        head.next = newNode;
        return head;
    }
    
    //iterate through the list otherwise.
    ListNode p = head;
    while(p.next!=null){
        p=p.next;
    }
    //we have come to the end of the list.
    p.next = newNode;
    return head;
    

}

//Firecode.io solution
public ListNode insertAtTail(ListNode head, int data) {           
      ListNode newNode = new ListNode(data);            
      if (head == null) {
          head = newNode;
      } else {
          ListNode curr = head;
          // Find the last node in the list
          while (curr.next != null) {
              curr = curr.next;
          }
          // insert the new node at the end
          curr.next = newNode;                
      }
      return head;
  }
  

