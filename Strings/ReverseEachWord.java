/* Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function 
so as to print the sentence such that each word in the sentence is reversed. */

import java.util.*;
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
        String words[] = str.split("\\s");
        String res="";
        for(String w:words){
            StringBuilder s = new StringBuilder(w);
            s.reverse();
            res+=s.toString()+" ";
        }
        return res;
	}

}
