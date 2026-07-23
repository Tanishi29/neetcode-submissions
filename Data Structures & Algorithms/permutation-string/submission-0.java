class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int s1len = s1.length();

        
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < s1len; i++){

            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            }

            else{
                map1.put(s1.charAt(i), 1);
            }
        }
        
        int left = 0; 
        for(int right = s1len - 1; right < s2.length(); right++){
            HashMap<Character, Integer> check = new HashMap<>();

            for(int j = left; j <= right; j++){
                if(check.containsKey(s2.charAt(j))){
                    check.put(s2.charAt(j), check.get(s2.charAt(j)) + 1);
                }

                else{
                    check.put(s2.charAt(j), 1);
                }
            }

            if( right - left + 1 == s1len){
                if(check.equals(map1)){
                return true;
            }
            left++;
        }
            
        }

        return false;
        
    }
}
