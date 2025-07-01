class Solution {
    public String[] divideString(String s, int k, char fill) {
        int numChunks = (s.length() + k - 1) / k; 
        String[] result = new String[numChunks];
        int i = 0; 
        int j = 0; 
        while (j + k <= s.length()) {
            result[i++] = s.substring(j, j + k);
            j += k;
        }
        if (j < s.length()) {
            StringBuilder last = new StringBuilder(s.substring(j));
            while (last.length() < k) {
                last.append(fill);
            }
            result[i] = last.toString();
        }
        return result;
    }
}