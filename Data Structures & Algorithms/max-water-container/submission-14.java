class Solution {
    public int maxArea(int[] heights) {

        int left = 0; 
        int right = heights.length - 1;
        int area = 0;
        int max = 0;
        int height = 0; 
        int width = 0;
        

        while(left < right){
         height = Math.min(heights[left], heights[right]);
         width = Math.abs(left - right);
         area = height * width;

        if(area > max){
            max = area;
        }

         if(heights[left] < heights[right]){
            left++;
        }
        else{
            right--;
        }

        }

        return max;
        
    }
}
