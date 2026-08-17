class Solution {
    public int findMin(int[] nums) {

        /*brute force

        int min = nums[0]; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
        
    }*/

        int left = 0;
        int right = nums.length - 1;

        while(left < right){

            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[right]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return nums[left];
}
}
