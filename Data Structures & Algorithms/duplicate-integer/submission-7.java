class Solution {
    public boolean hasDuplicate(int[] nums) {
      

      //Arrays.sort(nums);
       
       int count = 0;
      for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length; j++){
            if(nums[i] == nums[j] && i != j){
                count++;
            }
        }
        }

        boolean res;
        if(count > 0){
          res = true;
        }
        else{
          res = false;
        }
        return res;

        }

        
      }  
    
