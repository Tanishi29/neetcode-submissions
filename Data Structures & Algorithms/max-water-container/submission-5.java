class Solution {
    public int maxArea(int[] heights) {


      /*
        we wanna calculate height by taking the min height of a pair 
        width i - j 
        area = height * width 
        if area > assigned max then max = area
        return the max

      */

     int height = 0; 
      int width = 0; 
      int area = 0;
      int max = 0;

      /*for(int i = 0; i < heights.length; i++){
        for(int j = i + 1; j < heights.length; j++){
          height = Math.min(heights[i], heights[j]);
          width = Math.abs(i - j);
          area = height * width;
          if(area > max){
            max = area;
          }
        }
      }
      return max; */

      int left = 0;
      int right = heights.length - 1;

      while (left < right){
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
