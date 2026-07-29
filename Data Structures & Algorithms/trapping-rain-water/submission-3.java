class Solution {
    public int trap(int[] height) {

        /*
        if the array is null, then the sum is 0 too 
        we always want the min of right and left and subtract it with height[i]
        take the max of both left and right, take their min and subtract until the end of n
        and keep adding it to the var. 
        */

        if(height == null || height.length == 0){
            return 0;
        }

        int trappedwater = 0;
        //int n = height.length; 

        for(int i = 0; i < height.length; i++){
            int left = height[i];
            int right = height[i];

            for(int j = 0; j < i; j++){
                left = Math.max(left, height[j]);
            }
            for(int k = i + 1; k < height.length; k++){
                right = Math.max(right, height[k]);
            }

            trappedwater += Math.min(left, right) - height[i];
        }

        return trappedwater;
        
    }
}
