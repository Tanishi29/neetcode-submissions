class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean duplicate = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int count = 1;

            if(map.containsKey(nums[i])){
                duplicate = true;
            }
            else{
            map.put(nums[i], count);
            }

        }

        return duplicate;
        
    }
}