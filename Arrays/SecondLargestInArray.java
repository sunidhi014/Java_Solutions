/* You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer) */

import java.util.*;
import java.util.stream.*;
public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	int i, first, second,flag=0,n=arr.length;
       
        /* There should be atleast two elements */
        for (i = 0; i < arr.length; i++){
            if(arr[0]!=arr[i]){
                flag=1;
                break;
            }
        }
        if (n < 2 || flag==0) {
            return -2147483648;
        }
        else{
            first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            /* If current element is greater than
            first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
            return second;
    }
    }
}
