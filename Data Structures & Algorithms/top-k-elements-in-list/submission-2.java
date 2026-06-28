class Solution {
    public int[] topKFrequent(int[] nums, int k) {

      //we want to count all numbers in a given array and how many times they come in the array
      //if a number is new to the list we put them in a different slot and if they repeat, they go in 
      //an already existing slot that is assigned. (hash)

      //then we create an array where we set the max (k) value to 0 and if a max value is more than the curr
      //then that becomes the max 
      //the actual number with the max freq. goes inside the res array 
      //that is inside a for loop that is less than k. 
      
        
        HashMap<Integer, Integer> map = new HashMap <>(); 
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
              map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
              map.put(nums[i], 1);
            }
        }
      int[] res = new int[k];

      for(int i = 0; i < k; i++) {
        int max = 0;
        int num = 0;

        for(int key : map.keySet()){
          if(map.get(key) > max){
            max = map.get(key);
            num = key;
          }
        }
        res[i] = num;
        map.remove(num);
      }
    
    return res;

    }
}
