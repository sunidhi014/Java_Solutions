/* Given two lists sorted in increasing order, create a new list representing the intersection of the two lists. The new list should be made with its 
own memory — the original lists should not be changed. */

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
    Node dummy=new Node(0);
    Node curr=dummy;
    while(head1!=null && head2!=null){
        if(head1.data==head2.data){
            curr.next=new Node(head1.data);
            curr=curr.next;
            head1=head1.next;
            head2=head2.next;
        }
        else if(head1.data<head2.data)
            head1=head1.next;
        else
        head2=head2.next;
    }
    
    return dummy.next;
    
    }
}
