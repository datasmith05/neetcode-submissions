class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[] = new int[k];

        //Create a hashmap to store number and it's frequency
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Convert map into list to sort in decending
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        //Sort list in decending order
        //Comparator returns positive if a comes after b , zero if both are equal and negative when a comes before b
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        //Add staring k element from list 
        for(int i = 0; i < k; i++){
            arr[i] = list.get(i).getKey();
        }

        return arr;
    }
}
