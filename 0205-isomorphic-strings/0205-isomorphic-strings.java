class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false; 
                }
            } else {
                if (map.containsValue(c2)) {
                    return false;
                }
                map.put(c1, c2);
            }
        }
        // HashMap<Character, Character> mapST = new HashMap<>();
        // HashMap<Character, Character> mapTS = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     char c1 = s.charAt(i);
        //     char c2 = t.charAt(i);

        //     if (mapST.containsKey(c1)) {
        //         if (mapST.get(c1) != c2) return false;
        //     } else {
        //         mapST.put(c1, c2);
        //     }

        //     if (mapTS.containsKey(c2)) {
        //         if (mapTS.get(c2) != c1) return false;
        //     } else {
        //         mapTS.put(c2, c1);
        //     }
        // }

        return true;
    }
}