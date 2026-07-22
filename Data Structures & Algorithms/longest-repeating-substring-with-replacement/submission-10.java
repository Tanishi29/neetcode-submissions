class Solution {
    public int characterReplacement(String s, int k) {

        /*int strlen = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < strlen; i++){

            int count = 1;

            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }

            else{
            map.put(s.charAt(i), count);
            }
        }

         

        int max = 0;
        char character = ' ';
        for(Character key: map.keySet()){

            if(map.get(key) > max){
                max = map.get(key);
                character = key;
            }
        }

        int diff = strlen - max;

        return 0;*/


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
    
