class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        if(nums.length == 0){
            return 0;
        }

        int longest = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int length = 1;
                int current = num;
                while(set.contains(current + 1)){
                    length++;
                    current++;
                }
                
            longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
