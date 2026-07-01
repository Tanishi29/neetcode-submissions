class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

      List<List<Integer>> finList = new ArrayList<>();

      /* we wanna see if 3 numbers add up to 0 and the indices are not the same 
      so i < j < k
      if conditions meet a new List is created where nums are added 
       we sort them so that duplicate lists can be identified easily 
        the hashset speciality of .add helps in eliminating duplicates
        if no duplicate lists exist, we turn to return to the finalist of lists
          and return the 2D list. 
      */

      Set<List<Integer>> checkTriplet = new HashSet<>();
      

      for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length; j++){
          for(int k = 0; k < nums.length; k++){
            if((nums[i] + nums[j] + nums[k] == 0) && i < j && i < k && j < k){
              List<Integer> currList = new ArrayList<>();
              currList.add(nums[i]);
              currList.add(nums[j]);
              currList.add(nums[k]);

              currList.sort(null); //sort it cuz we wanna compare

              if(checkTriplet.add(currList)){ //would only run if the hashset does not have duplicates
              finList.add(currList); //at to the finList if no duplicates there 
            }
            }
            

          }
        }
      }

      return finList;
        
    }
}
