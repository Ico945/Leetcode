package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters2 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters2().lengthOfLongestSubstring(str));
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2)
            return s.length();
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0,j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            result = Math.max(result,i-j+1);
        }
        return result;
    }
}
