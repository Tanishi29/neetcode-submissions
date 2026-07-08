class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        char [] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        char [] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);

        return isAnagram;


    }
}
