/* Given a NxN matrix of positive integers. There are only three possible moves from a cell Matrix[r][c].

Matrix [r+1] [c]
Matrix [r+1] [c-1]
Matrix [r+1] [c+1]
Starting from any column in row 0 return the largest sum of any of the paths up to row N-1.

NOTE: We can start from any column in zeroth row and can end at any column in (N-1)th row. */



//User function Template for Java

class Solution{
    static int maximumPath(int n, int matrix[][])
    {
        // code here
    int[][] dp = new int[n][n];

    // Initialize first row of dp array
    for (int j = 0; j < n; j++) {
        dp[0][j] = matrix[0][j];
    }

    // Compute values for remaining rows of dp array
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int prevLeft = (j > 0) ? dp[i-1][j-1] : 0;
            int prevRight = (j < n-1) ? dp[i-1][j+1] : 0;
            int prevMiddle = dp[i-1][j];
            dp[i][j] = matrix[i][j] + Math.max(Math.max(prevLeft, prevRight), prevMiddle);
        }
    }

    // Find the maximum sum in the last row of dp array
    int maxSum = dp[n-1][0];
    for (int j = 1; j < n; j++) {
        maxSum = Math.max(maxSum, dp[n-1][j]);
    }

    return maxSum;
    }
}
