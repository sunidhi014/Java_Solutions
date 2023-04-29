/* Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given
positive integer smaller than or equal to length of the linked list. */

/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        //base case
        if(head==null)
        return head;
        
        int l=1;
        //find length if ll
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            l++;
        }
        
        k=k%l;
        //edge case
        if(k==l || k==0)
        return head;
        
        //make ll circular
        temp.next=head;
        
        //reach new head in ll
        for(; k > 0; k--){
            temp=temp.next;
        }
        
        //break the loop and return new head
        head=temp.next;
        temp.next=null;
        
        return head;
    }
}
