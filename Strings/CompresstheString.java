/* Write a program to do basic string compression. For a character which is consecutively repeated more than once, 
replace consecutive duplicate occurrences with the count of repetitions. */

public class Solution {
	public static String getCompressedString(String s) {
		// Write your code here.
         String ans = "";
    for (int i = 0 ; i < s.length(); i++) {
      int count = 1;
      while (i < s.length() - 1
             && s.charAt(i) == s.charAt(i + 1)) {
        count++;
        i++;
      }
      ans += s.charAt(i);
      if (count > 1) {
        ans += count;
      }
    }
    return ans;
	}

}
