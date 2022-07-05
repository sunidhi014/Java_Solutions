/* For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string. */


public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String c1=""+ch;
        return str.replace(c1,"");
	}

}
