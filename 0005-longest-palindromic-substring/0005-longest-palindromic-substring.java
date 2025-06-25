class Solution {
    public static boolean isPalindrome(char[] arr, int start, int end) {
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to find the longest palindrome using array
    public static String longestPalindrome(String str) {
        char[] arr = str.toCharArray();
        int maxLength = 0;
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (isPalindrome(arr, i, j)) {
                    int length = j - i + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        startIndex = i;
                    }
                }
            }
        }

        return str.substring(startIndex, startIndex + maxLength);

    }
}