class Solution {
    public int countPrefixes(String[] words, String s) {
        int out = 0;
        for (String str : words) {
            if (s.startsWith(str)) {
                out++;
            }
        }
        return out;
    }
}