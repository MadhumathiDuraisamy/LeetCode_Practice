class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> arr = new ArrayList<>();
        if (digits.length() == 0) return arr;

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        char[] ch = new char[4];
        for (int i = 0; i < digits.length(); i++) {
            ch[i] = digits.charAt(i);
        }

        for (int i = 0; i < map.get(ch[0]).length(); i++) {
            char c1 = map.get(ch[0]).charAt(i);
            if (digits.length() == 1) {
                arr.add("" + c1);
                continue;
            }
            for (int j = 0; j < map.get(ch[1]).length(); j++) {
                char c2 = map.get(ch[1]).charAt(j);
                if (digits.length() == 2) {
                    arr.add("" + c1 + c2);
                    continue;
                }
                for (int k = 0; k < map.get(ch[2]).length(); k++) {
                    char c3 = map.get(ch[2]).charAt(k);
                    if (digits.length() == 3) {
                        arr.add("" + c1 + c2 + c3);
                        continue;
                    }
                    for (int m = 0; m < map.get(ch[3]).length(); m++) {
                        char c4 = map.get(ch[3]).charAt(m);
                        arr.add("" + c1 + c2 + c3 + c4);
                    }
                }
            }
        }
        return arr;
    }
}