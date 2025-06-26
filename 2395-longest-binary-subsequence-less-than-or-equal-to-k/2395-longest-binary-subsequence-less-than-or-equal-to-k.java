class Solution {
    public int longestSubsequence(String s, int k) {
        int number = 0, counter = 0;
        int bitValue = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                counter++;
                bitValue = Math.max(bitValue, bitValue * 2); 
            } else if (number + bitValue <= k) {
                number += bitValue;
                counter++;
                bitValue = Math.max(bitValue, bitValue * 2);
            }
        }
        return counter;
    }
}