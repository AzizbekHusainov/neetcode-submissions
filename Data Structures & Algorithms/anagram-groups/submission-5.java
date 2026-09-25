class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] sort = str.toCharArray();
            Arrays.sort(sort);
            String checkString = new String(sort);

            if (!map.containsKey(checkString)) {
                map.put(checkString, new ArrayList<String>());
            }

           map.get(checkString).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
