/* You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not. */

import java.util.*;
/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        LinkedListNode<Integer> slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
        slow=head;
        while (slow != null) {
            int i = stack.pop();
            if (slow.data != i) {
                ispalin = false;
                break;
            }
            slow = slow.next;
        }
        return ispalin;
	}

}
