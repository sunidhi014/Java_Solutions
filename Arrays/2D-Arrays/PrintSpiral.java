/* For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration: */


public class Solution {

	public static void spiralPrint(int a[][]){
		//Your code goes here
        if(a.length!=0 && a[0].length!=0){
        int i, k = 0, l = 0;
  		int m = a.length;
        int n = a[0].length;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
  
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
  
            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
  
            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
  
            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }}
	}
}
