class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        char [] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        char [] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        boolean isAnagram = true;

        if(s.length() != t.length()){
            isAnagram = false;
        }

        for(int i = 0; i < arr1.length; i++){
            int count = 1;

            if(map.containsKey(arr1[i])){
                count++;
                 map.put(arr1[i], map.get(arr1[i]) + 1);
            }
            else{
                map.put(arr1[i], count);
            }
           
        }

        for(int i = 0; i < arr2.length; i++){
            int count = 1;

            if(map2.containsKey(arr2[i])){
                count++;
                 map2.put(arr2[i], map2.get(arr2[i]) + 1);
            }
            else{
                map2.put(arr2[i], count);
            }
           
        }

         isAnagram = map.equals(map2);


        //boolean isAnagram = Arrays.equals(arr1, arr2);

        return isAnagram;


    }
}
