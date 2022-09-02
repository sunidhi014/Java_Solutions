//GEG

class Solution{
    
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node nxt=head;
        while(curr!=null || nxt!=null){
            nxt = curr.next;
            curr.next = prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
    Node head = null;
        first = reverse(first);
        second = reverse(second);
        int sum=0;
        while(first!=null || second!=null || sum!=0){
            if(first!=null){
                sum+=first.data;
                first=first.next;}
            if(second!=null){
                sum+=second.data;
                second=second.next;}
            Node temp = new Node(sum%10);
            temp.next = head;
            head = temp;
            sum=sum/10;
        }
        return head;
    }
}
