class Solution {
    public boolean isPalindrome(String s) {

        String noSpace = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char [] arr = noSpace.toCharArray();
        boolean isPalindrome = true;

        int left = 0; 
        int right = arr.length - 1;

        
            while(left < right){
                if(arr[left] != arr[right]){
                
                isPalindrome =  false;
                
            }
            left++;
            right--;
            }
            

            

        return isPalindrome;
        
        
    }
}
