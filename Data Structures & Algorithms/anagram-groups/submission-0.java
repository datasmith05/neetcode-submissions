class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagram = new ArrayList<>();

        //Use the HashMap for storing string and its anagram
        Map<String, List<String>> hashmap = new HashMap<>();

        //Sort every string of the array 
        for(int i = 0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            //Store sorted String as a Key and original string as a Value
            //If String existed in hashmap then add to the list and if not then create the new list then add 
            hashmap.computeIfAbsent(s, k -> new ArrayList<>()).add(strs[i]);
        }

        //Iterate through the hashmap and store the HashMap value (List<String>) in the List<List> stucture
        for(Map.Entry<String, List<String>> set : hashmap.entrySet()){
            anagram.add(set.getValue());
        }

        return anagram;
    }
}
