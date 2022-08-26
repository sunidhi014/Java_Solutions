/* You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the 
front of the singly linked list and returns the new head to the list. */

public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        if(head==null) return head;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> tail=head;
        int i = -n;
		while(tail.next!=null){
		if(i>=0){                          
			temp = temp.next;
		}
		tail = tail.next;
		i++;
	}
	//Connecting the tail to head
	tail.next = head;                      
	//Assigning the new node
	head = temp.next;                         
	//Deleting the previous connection
	temp.next = null;                         

	return head;
	}

}
