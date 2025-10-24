import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();
        result.add(""); 

        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            String letters = map[digit - '0'];

            for (String prefix : result) {
                for (char letter : letters.toCharArray()) {
                    temp.add(prefix + letter);
                }
            }

            result = temp;
        }

        return result;
    }
}
