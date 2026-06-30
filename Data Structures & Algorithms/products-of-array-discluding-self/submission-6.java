class Solution {
    public int[] productExceptSelf(int[] nums) {

          //first we create an array of the same size of the provided array 
          //2. we want the outer loop to go through the array values one-by-one 
          //3. the nested loop will go through it again, and keep multiplying all values 
          //until i==j! 
          //then we store the values in the created array and return the array
      int[] product = new int[nums.length];

      for(int i = 0; i < nums.length; i++){
        int res = 1;
        for(int j = 0; j < nums.length; j++){
          if(i != j)
            res *= nums[j];
            
          }
          product[i] = res;
        }
        return product;
        
      }

      
        
    }
  
