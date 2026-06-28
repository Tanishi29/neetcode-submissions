class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      HashMap<String, List<String>> map = new HashMap<>(); //creating a hashmap that contains key of each string

      for(int i = 0; i < strs.length; i++){

        int[] count = new int[26]; //creating an array of 26 ints where the count of each character of each string peice by peice gets stored here)

        for(char c : strs[i].toCharArray()){
          count[c - 'a']++;  //count increases through ASCII use
        }

        String key = Arrays.toString(count); //coverting it back to string

        if(!map.containsKey(key)){
          map.put(key, new ArrayList<>());
        }

        map.get(key).add(strs[i]);
      }

      return new ArrayList<>(map.values());
        
    }
}
