/* Given a singly linked list of size N. The task is to swap elements in the linked list pairwise. */

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null)return head;
       //swap
       Node temp = head.next;
       head.next = temp.next;
       temp.next = head;
       head = temp;
       head.next.next = pairwiseSwap(head.next.next);
       return head;
    }
}
