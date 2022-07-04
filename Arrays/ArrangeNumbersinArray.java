/* You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array. 
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2. */

import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
      Arrays.fill(arr, 0);
      int i=0, j=n-1;
      int number=1;
      while(i < j){
          arr[i]=number;
          number++;
          i++;
          arr[j]= number;
          number++;
          j--;
          if(i==j)
          arr[i]=number;
          }
      }
}
