class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCount1 = new HashMap<>();
        Map<Character, Integer> charCount2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (charCount1.containsKey(c)) {
                charCount1.put(c,charCount1.get(c) + 1);
            } else {
                charCount1.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (charCount2.containsKey(c)) {
                charCount2.put(c,charCount2.get(c) + 1);
            } else {
                charCount2.put(c, 1);
            }
        }
        
        if (charCount1.equals(charCount2)) {
            return true;
        } else {
            return false;
        }  
    }
}
