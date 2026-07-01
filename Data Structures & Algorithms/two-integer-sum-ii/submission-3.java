class Solution {
    public int[] twoSum(int[] numbers, int target) {

      /*Brute force method: 
      create an array of size 2 (cuz it's a two sum)
      go through a nested loop and make sure the index values add up to
      the target value and the num[i] < num[j]
      since it is 1-indexed, we store the index + 1; 
      */

      int[] res = new int[2];

      for(int i = 0; i < numbers.length; i++){
        for(int j = 0; j < numbers.length; j++){
          if(numbers[i] + numbers[j] == target && numbers[i] < numbers[j]){
            res[0] = i + 1;
            res[1] = j + 1;
          }

        }
      }

      return res;
        
    }
}
