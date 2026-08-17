class Solution {
    public int search(int[] nums, int target) {

        /* brute force 

        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index = i;
            }
        }
        return index;*/

        int left = 0; 
        int right = nums.length - 1;

        while (left <= right){

            int mid = left + (right - left) / 2;

        //we first check if the left side of the array is sorted or not
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1; //target is in the left partition
            }
            else{
                left = mid + 1; //update left to the right partition if not true
            }
                
            }

            else{ //same but verifying and doing the right partition
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }

            }

            if(nums[mid] == target){
                return mid;
            }
        }

        return -1;

        
        
    }
}
