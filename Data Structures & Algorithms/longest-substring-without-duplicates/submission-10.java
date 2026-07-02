class Solution {
    public int lengthOfLongestSubstring(String s) {

      
      
      Set<Character> check = new HashSet<>();
      
      
      int left = 0;
      int right = 0; 
      int max = 0;
      while(right < s.length()){
      char c = s.charAt(right);
      while(check.contains(c)){
        check.remove(s.charAt(left));
        left++;
        }
        check.add(c);
        max = Math.max(max, right - left + 1);
        right++;
      }

      return max;
      
        
    }
}
