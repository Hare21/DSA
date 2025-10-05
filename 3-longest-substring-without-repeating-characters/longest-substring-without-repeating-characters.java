class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int lh = 0;
    int maxLength = 0; 

        for(int rh = 0; rh < s.length(); rh++){
            char ch = s.charAt(rh);

            if(map.containsKey(ch) && map.get(ch) >= lh){
                    lh = map.get(ch) +1;
            }
          
          map.put(ch,rh);
          maxLength = Math.max(maxLength, rh - lh + 1); 

        }
        return maxLength;
        
    }
}