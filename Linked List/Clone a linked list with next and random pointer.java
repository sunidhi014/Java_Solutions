/* Construct a copy of the given list. The copy should consist of exactly N new nodes, where each new node has its value set to the 
value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such 
that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list. */

/*
class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}*/

class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        if (head == null) {
            return null;
        }
 
        // Step 1: Create new nodes and insert them next to the original nodes
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
 
        // Step 2: Set the random pointers of the new nodes
        curr = head;
        while (curr != null) {
            if (curr.arb != null) {
                curr.next.arb = curr.arb.next;
            }
            curr = curr.next.next;
        }
 
        // Step 3: Separate the new nodes from the original nodes
        curr = head;
        Node clonedHead = head.next;
        Node clonedCurr = clonedHead;
        while (clonedCurr.next != null) {
            curr.next = curr.next.next;
            clonedCurr.next = clonedCurr.next.next;
            curr = curr.next;
            clonedCurr = clonedCurr.next;
        }
        curr.next = null;
        clonedCurr.next = null;
 
        return clonedHead;
    }
}

