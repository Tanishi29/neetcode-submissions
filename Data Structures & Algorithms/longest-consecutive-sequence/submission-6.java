class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){
        int count = 0;
        int curr = 0;

        if(!(set.contains(num - 1))){
            curr = num;
            count = 1;
        }

        while(set.contains(curr + 1)){
            curr++;
            count++;
            
        }

        longest = Integer.max(longest, count);


        }

        return longest;
        
    }
}
