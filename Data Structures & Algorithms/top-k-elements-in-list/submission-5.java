class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        /*
            the hashmap takes each integer from the array and its count(frequency)
            then we need another for loop until we reach k and keep finding the max
            and store inside a new array (the most frequent num) and remove the num
            so that we can find the next frequent num in the hashmap. 
        */

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int count = 1;

            if(map.containsKey(nums[i])){
                count++;
                map.put(nums[i], map.get(nums[i]) + 1);
            }

            else{
                map.put(nums[i], count);
            }
        }

        int [] arr = new int[k];

        /* key is like the map.get(i) inside keySet which is like arr.length*/

        for(int i = 0; i < k; i++){

            int num = 0; 
            int max = 0;

            for(int key : map.keySet()){
                if(map.get(key) > max){
                    max = map.get(key);
                    num = key;
                }
            }

            arr[i] = num;
            map.remove(num);

        }

        return arr;
        
    }
}
