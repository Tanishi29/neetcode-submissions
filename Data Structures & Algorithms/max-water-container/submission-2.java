class Solution {
    public int maxArea(int[] heights) {

      int height = 0; 
      int width = 0; 
      int area = 0;
      int max = 0;

      for(int i = 0; i < heights.length; i++){
        for(int j = i + 1; j < heights.length; j++){
          height = Math.min(heights[i], heights[j]);
          width = Math.abs(i - j);
          area = height * width;
          if(area > max){
            max = area;
          }
        }
      }
      return max;
        
    }
}
