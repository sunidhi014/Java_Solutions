/* For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, 
i.e, print the first column top to bottom, next column bottom to top and so on. */


public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        if(mat.length!=0 && mat[0].length!=0)
        {
        for(int j=0;j<mat[0].length;j++){
			if(j%2==0){
                for(int i=0;i<mat.length;i++)
                    System.out.print(mat[i][j]+" ");
            }
            else{
                for(int i=mat.length-1;i>=0;i--)
                    System.out.print(mat[i][j]+" ");
            }
        }
      }
	}

}
