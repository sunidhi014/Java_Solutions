/* Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. 
Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index).
The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. 
output array/list will also contain only single digit at every index. */

import java.util.*;
import java.util.Arrays;
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    int n1=arr1.length;
    int n2=arr2.length;
    
    int i = n1 - 1;
    int j = n2 - 1;
    int k = output.length-1;
    int c = 0;
    while (i >= 0 || j >= 0) {
      int d = c;

      if (i >= 0)
        d += arr1[i];

      if (j >= 0)
        d += arr2[j];

      c = d / 10;
      d = d % 10;
      output[k] = d;

      i--;
      j--;
      k--;
    }
    

}

}
