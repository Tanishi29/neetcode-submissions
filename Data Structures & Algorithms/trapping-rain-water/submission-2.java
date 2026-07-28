class Solution {
    public int trap(int[] height) {

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
