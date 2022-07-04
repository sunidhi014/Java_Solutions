/* You have been given a random integer array/list(ARR) of size N. You have been required to push all the zeros that are present in the array/list to the end of it. 
Also, make sure to maintain the relative order of the non-zero elements. */

public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int c=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[c++]=arr[i];
            }
        }
        while (c<n)
        {
            arr[c]=0;
            c++;
        }
        
    }

}
            
