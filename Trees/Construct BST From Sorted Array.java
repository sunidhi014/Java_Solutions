/* Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST from this input array. 
Return the root of constructed BST. Note: If array size is even, take first mid as root. */

public class Solution {

	/*	Binary Tree Node class 
	    class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
	*/
	/*
		Time complexity: O(N)
		Space complexity: O(N)
	
		where N is the number of nodes in the input Array
	*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return SortedArrayToBSTHelper(arr,0,n-1);
		}
		
		private static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int start, int end) {
			if(start > end ) {
				return null;
			}
			int mid = start + (end-start)/2;
			
			BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(arr[mid]);
			temp.left = SortedArrayToBSTHelper(arr, start, mid-1);
			temp.right = SortedArrayToBSTHelper(arr, mid+1, end);
			return temp;
		}
}
