class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (isSameRow(lowerWord, row1) || isSameRow(lowerWord, row2) || isSameRow(lowerWord, row3)) {
                result.add(word);  // Add original word, not lowerWord
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean isSameRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
