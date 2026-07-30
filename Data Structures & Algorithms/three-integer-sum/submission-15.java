class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        ArrayList<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1] ){
                continue;
            } //makes sure nums[i] repeats any previous test num

            int left = i+1; 
            int right = nums.length - 1;

           

            while(left < right){
                 int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){  //if sum = 0, we add it in a list and then the final list
                ArrayList<Integer> curr = new ArrayList<>();
                curr.add(nums[i]);
                curr.add(nums[left]);
                curr.add(nums[right]);

                list.add(curr);

                left++; //increment the pointer
                right--;

                while(left < right && nums[left] == nums[left - 1]){ //we don't want i, left, and right to be equal
                    left++;
                }
                while(left < right && nums[right] == nums[right + 1]){
                    right--;
                }

            }

            else if(sum < 0){
                left++;
            }

            else if(sum > 0){
                right--;
            }
            }
        }

        return list;
        
    }
}
