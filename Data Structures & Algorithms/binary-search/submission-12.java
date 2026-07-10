class Solution {
    public int search(int[] nums, int target) {

        int low = 0; 
        int high = nums.length - 1;
        

        while(low <= high){
            int mid = (high + low) / 2; //some basic avg/ mid 

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            low = mid + 1;  //like 2 pointers, move the smaller side to increment when result < target
        }
        else{
                high = mid - 1; //like 2 pointers, move the right side to decrement when result > target
        }
        }

        return -1;
        
    }
}
