/* You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, 
there is a single integer value that is present twice. You need to find and return that duplicate number present in the array. */

import java.util.*;
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        Set<Integer> a = new HashSet<Integer>();
        for (int item : arr) {
     if (a.add(item) == false) {
        // your duplicate element
         return item;
         }
    }
    return 0;
    }
}
