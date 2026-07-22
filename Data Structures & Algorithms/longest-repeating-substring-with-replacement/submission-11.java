class Solution {
    public int characterReplacement(String s, int k) {
            /* 
            we store the freqency of each character and their frequencies 
            in a hashmap
            if the count (map.get(s.charAt(right))) > frequency of the most common character
            then the maxfreq is replaced with the new count

            windowlength of a substring = right - left + 1 
            we subtract maxfreq char count from the windowlength and if it is > k, it's not a 
            valid window, we move the left pointer up, 
            but the character at the previous left pointer gets their count deducted since they're
            out of the window

            the res = max windowlength and return res

        */
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++){

            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
            }

            else{
            map.put(s.charAt(right), 1);
            }

            if(map.get(s.charAt(right)) > maxFreq){
                maxFreq = map.get(s.charAt(right));
            }

                //here right - left + 1 is the windowlength - maxfreq of a char is > k
            while((right - left + 1 - maxFreq) > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            res = Math.max(res, right-left + 1); //res, windowlength 
            }

            return res;
        }






        
    }
    
