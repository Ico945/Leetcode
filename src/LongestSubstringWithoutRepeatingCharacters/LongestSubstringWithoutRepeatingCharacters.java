package LongestSubstringWithoutRepeatingCharacters;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(str));
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
            return s.length();
        int temres = 0,res = 0;
        StringBuffer temstr = new StringBuffer();
        for(int i = 0;i<s.length();){
            for(int j = i;j<s.length();j++){
                if(temstr.indexOf(""+s.charAt(j)) == -1){
                    temstr.append(s.charAt(j));
                    temres++;
                }
                else {
                    temstr = new StringBuffer();
                    res = Math.max(res,temres);
                    temres = 0;
                    i = temstr.indexOf(""+s.charAt(j));
                    break;
                }
            }
        }
        return res;
    }
}
