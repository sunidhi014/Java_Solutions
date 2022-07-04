/* Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on.
Individual words should remain as it is. */

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String s[] = input.split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            ans += s[i] + " ";
        }
       return ans;
	}
}
