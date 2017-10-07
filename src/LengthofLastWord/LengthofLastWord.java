package LengthofLastWord;

public class LengthofLastWord {
    public static void main(String[] args) {
        String str = "day";
        System.out.println(new LengthofLastWord().lengthOfLastWord(str));
    }
    public int lengthOfLastWord(String s) {
        if(s.length()==0)
            return 0;
        int last = s.length()-1;
        int count = 0;
        while (s.charAt(last)==' '){
            last--;
            if(last<0)
                return 0;
        }
        for(int i = last;i>=0;i--){
            if(s.charAt(i)!=' ')
                count++;
            else return count;
        }
        return count;
    }
}
