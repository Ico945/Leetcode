package LetterCombinationsofaPhoneNumber;
import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    static ArrayList<String> str = new ArrayList<String>(){{add("0");add("1");add("abc");add("def");add("ghi");add("jkl");add("mno");add("pqrs");add("tuv");add("wxyz");}};
    public static void main(String[] args) {
        System.out.println(new LetterCombinationsofaPhoneNumber().letterCombinations(""));
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0)
            return result;
        StringBuffer temstr = new StringBuffer();
        backtrack(result,temstr,digits,0);
        return result;
    }
    public void backtrack(List<String> result,StringBuffer temstr,String gigits,int index){
        if(temstr.length() == gigits.length())
            result.add(temstr.toString());
        else {
            int num = gigits.charAt(index)-'0';
            String s = str.get(num);
            for(int i = 0;i<s.length();i++){
                temstr.append(s.charAt(i));
                backtrack(result,temstr,gigits,index+1);
                temstr.deleteCharAt(temstr.length()-1);
            }
        }
    }
}
