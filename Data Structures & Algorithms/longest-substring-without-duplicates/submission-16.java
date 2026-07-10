class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length(); //length of the string

        int left = 0; //setting both pointers the same (since it's sliding window)
        int right = 0; 
        int max = 0; //max is set to 0 and will be compared in the loop

        HashSet<Character> set = new HashSet<>(); //we use hashset cuz we don't want duplicates

        for(int i = right; i < n; i++){

            while(set.contains(s.charAt(i))){ //while we keep seeing a value being a duplicate at a certain left index
                set.remove(s.charAt(left)); //we remove the previous (left index) duplicate value
                left++; //shift window
            }

            set.add(s.charAt(i)); //we now add the right value

            max = Math.max(max, i - left + 1); //take the max of a stored max and the difference of indices 
            
        }

        return max;
        
    }
}
