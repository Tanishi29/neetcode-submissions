class Solution {
    public int longestConsecutive(int[] nums) {

        // we first create a hashset (in a hashset values of an array aren't duplicated)
        //the int val longest will be set to 0 at first
        //if (num - 1 exists then it isn't the start of a sequence or else it is)
        //and then we initialize the count to 1
        //we keep counting until the num + 1 exists and keep moving the curr value as well
        //then the longest int val is the max between (itself, count) and then we return it
        
      Set<Integer> numSet = new HashSet<>();
      for(int num : nums){
        numSet.add(num);
      }


      int longest = 0;

      for(int num : numSet){
        int curr = 0;
        int count = 0;

        if(!(numSet.contains(num - 1))){
           curr = num;
           count = 1;
        }
        
        while(numSet.contains(curr + 1)){
          curr++;
          count++;
        }
        longest = Integer.max(longest, count);
      }

      return longest;
        
    }
}
