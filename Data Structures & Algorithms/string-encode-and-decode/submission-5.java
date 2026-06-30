class Solution {

    public String encode(List<String> strs) {
      
      StringBuilder res = new StringBuilder();
      for(int i = 0; i < strs.size(); i++){
        int length = strs.get(i).length();
        res.append(length).append("#").append(strs.get(i));
      }
      return res.toString();
    }

    public List<String> decode(String str) {

      List<String> res = new ArrayList<>();

      int i = 0;
      while(i < str.length()){
        int hashIndex = str.indexOf("#", i);
        String lenString = str.substring(i, hashIndex);
        int length = Integer.parseInt(lenString);
        String ans = str.substring(hashIndex + 1, hashIndex + 1 + length);
        res.add(ans);

        i = hashIndex + 1 + length;
      }

      return res;
      
    }
}
