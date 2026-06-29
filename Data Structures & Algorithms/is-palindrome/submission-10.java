class Solution {
    public boolean isPalindrome(String s) {

      String noSpace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

      char [] chars = noSpace.toCharArray();

      boolean isPalindrome = true;

      for(int i = 0; i < chars.length / 2; i++){
        
          if(chars[i] != chars[chars.length - 1 - i]){
            isPalindrome = false;
          }
          
        }
        return isPalindrome;
      }

      
        
    }

