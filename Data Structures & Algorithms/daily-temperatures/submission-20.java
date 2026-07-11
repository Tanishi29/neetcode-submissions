class Solution {
    public int[] dailyTemperatures(int[] temperatures) {


         /* brute force 
        int [] arr = new int [temperatures.length];
        
        for(int i = 0; i < temperatures.length; i++){
            for(int j = i +1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i] ){
                    int diff = j - i;
                    arr[i] = diff;
                    break;
                }
                
            }
        }

        return arr; */

        Stack<Integer> stack = new Stack<>();
        int [] arr = new int [temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            

            while((!stack.empty()) && temperatures[i] > temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                arr[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return arr;


       
        
    }
}
