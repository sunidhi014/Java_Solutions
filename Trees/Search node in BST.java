/* Given a BST and an integer k. Find if the integer k is present in given BST or not. You have to return true, if node with data k is present, return false otherwise.
Note: Assume that BST contains all unique elements. */

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * Time complexity: O(H) 
	 * Space complexity: O(H)
	 * 
	 * where H is the height of the input BST
	 */

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		
		if (root == null) {
			return false;
		}
		if(root.data==k) {
			return true;
		}
		else if(root.data>k)
		{
			return searchInBST(root.left, k);
		}
		else
		{
			return searchInBST(root.right, k);
		}
	}
}
