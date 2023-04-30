/* Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Each of the sub-linked-list is in sorted order.
Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order.  */

class GfG
{   
    Node merge(Node a, Node b){
    if(a==null)
    return b;
    if(b==null)
    return a;
    
    Node res;
    if(a.data<b.data){
        res=a;
        res.bottom=merge(a.bottom,b);
    }
    else{
        res=b;
        res.bottom=merge(a,b.bottom);
    }
    res.next=null;
    return res;
}
    Node flatten(Node root)
    {
	if(root==null || root.next==null)
	return root;
	
	root.next=flatten(root.next);
	
	root=merge(root,root.next);
	
	return root;
    }
}
