/* You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left). */

import java.util.*;
public class Solution {  
    public static void reverse(int[] arr, int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

}
