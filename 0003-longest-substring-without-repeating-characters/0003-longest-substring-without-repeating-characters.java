class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        int start = 0;
        int[] index = new int[128];
        for(int i = 0 ; i < n ; i ++){
            char c = s.charAt(i);
            start = Math.max(index[c], start);
            index[c] = i + 1;
            result = Math.max(result, i - start + 1);
        }
        return result;
        //   HashSet<Character> set = new HashSet<>();
        // int maxLen = 0;
        // int left = 0, right = 0;

        // while (right < s.length()) {
        //     char c = s.charAt(right);
        //     if (!set.contains(c)) {
        //         set.add(c);
        //         maxLen = Math.max(maxLen, right - left + 1);
        //         right++;
        //     } else {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        // }

        // return maxLen;
    }
}