/*  You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain 
a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists. */

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	  int n1=arr1.length;
        int n2=arr2.length;
        
        for(int i=0;i<n1;i++){
            
            for(int j=0;j<n2;j++){
            
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
