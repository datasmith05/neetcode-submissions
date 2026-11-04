class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        // Count the frequency of each character in the current string
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            // Convert the frequency array into a String to use as the HashMap key
            String key = Arrays.toString(count);
            // If key is absent then add key and create a list for storing string in HashMap
            map.putIfAbsent(key, new ArrayList<>());
            // Add the original string to the list associated with this key
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
