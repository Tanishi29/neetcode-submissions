class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

      List<List<Integer>> finList = new ArrayList<>();

      //List<Integer> firstList = new ArrayList<>();

      //List<Integer> secondList = new ArrayList<>();

      Set<List<Integer>> checkTriplet = new HashSet<>();
      

      for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length; j++){
          for(int k = 0; k < nums.length; k++){
            if((nums[i] + nums[j] + nums[k] == 0) && i < j && i < k && j < k){
              List<Integer> currList = new ArrayList<>();
              currList.add(nums[i]);
              currList.add(nums[j]);
              currList.add(nums[k]);

              currList.sort(null);

              if(checkTriplet.add(currList)){
              finList.add(currList);
            }
            }
            

          }
        }
      }

      return finList;
        
    }
}
