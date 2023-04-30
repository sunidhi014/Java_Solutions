/* Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes are to be used as 
previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. 
The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL. */

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node prev=null;
    Node bToDLL(Node root)
    {
	if(root==null)
    return root;
    Node head=bToDLL(root.left);
    if(prev==null){
        head=root;
    }
    else{
        root.left=prev;
        prev.right=root;
    }
    prev=root;
    bToDLL(root.right);
    return head;
    }
}
