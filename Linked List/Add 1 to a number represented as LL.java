/* A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it. */

class Solution
{
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        head = reverse(head);
        Node temp=head;
        if(temp.data!=9){
            temp.data=temp.data+1;
            head=reverse(head);
            return head;
        }
        while(temp.data==9 && temp.next!=null){
            temp.data=0;
            temp=temp.next;
        }
            temp.data=temp.data+1;
            head=reverse(head);
            return head;
    }
}
