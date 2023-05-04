/* Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.The result is
going to be very large, hence return the result in the form of a string. */

class Solution {
    String printLargest(String[] arr) {
        // code here
    
    Arrays.sort(arr, new Comparator<String>() {
        public int compare(String a, String b) {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        }
    });
    
    StringBuilder sb = new StringBuilder();
    for (String s : arr) {
        sb.append(s);
    }
    
    // Handle leading zeros
    while (sb.charAt(0) == '0' && sb.length() > 1) {
        sb.deleteCharAt(0);
    }
    
    return sb.toString();
    }
}
