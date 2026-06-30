//import java.util.HashSet;
//import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {

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
