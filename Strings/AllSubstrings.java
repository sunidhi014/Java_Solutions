/* For a given input string(str), write a function to print all the possible substrings. */

import java.util.*;
import java.lang.String;
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        int i,end;
        int n=str.length();
        for(i=0;i<=n;i++){
            for(end=i;end<=n;end++){
                System.out.println(str.substring(i,end));
            }
        }
	}

}
