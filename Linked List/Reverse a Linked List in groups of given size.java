/* Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list. 
If the number of nodes is not a multiple of k then left-out nodes, in the end, should be considered as a group and must be reversed */

/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
      Node current=node;
      Node prev=null;
      Node forward=null;
      
      int count=0;
      while(current!= null && count<k ){
          forward=current.next;
          current.next=prev;
          prev=current;
          current=forward;
          count++;
      }
      if(forward!=null){
      node.next= reverse(forward,k);
    }
    return prev;

    }
}
