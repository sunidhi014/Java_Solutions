/* For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the 
largest sum(sum of all the elements in a row/column) amongst all the rows and columns. */


public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        int row=Integer.MIN_VALUE;
        int col=Integer.MIN_VALUE;
        int r=0;
        int c=0;
        if(mat.length>0){
            for(int i=0;i<mat.length;i++){
                int sum=0;
                for(int ele:mat[i]) sum+=ele;
                if(row<sum){
                r=i;
                row=sum;
            }
            }
            
            for(int i=0;i<mat[0].length;i++){
                int sum=0;
                for(int j=0;j<mat.length;j++){
                    sum+=mat[j][i];
                }
                if(col<sum){
                c=i;
                col=sum;
            }
            }
        }
        if (row>=col) System.out.println("row "+r+" "+row);
        else System.out.println("column "+c+" "+col);
	}

}
