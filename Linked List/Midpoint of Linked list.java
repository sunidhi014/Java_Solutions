/* For a given singly linked list of integers, find and return the node present at the middle of the list. */

public class Solution {
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null) return head;
        LinkedListNode<Integer> slow_ptr = head;
        LinkedListNode<Integer> fast_ptr = head.next;
         
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
        return slow_ptr;
    }

}
