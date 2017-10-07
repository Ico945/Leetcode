package LongestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "dkasgsa";
        System.out.println(new LongestPalindromicSubstring().longestPalindrome(s));
    }
    int lo = 0,len = 0;
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return s;
        for(int i = 0;i<s.length()-1;i++){
            deal(s,i,i);
            deal(s,i,i+1);
        }
        return s.substring(lo,lo+len);
    }
    public void deal(String s,int m,int n){
        while (m>=0&&n<s.length()&&s.charAt(m)==s.charAt(n)){
            m--;
            n++;
        }
        m++;n--;
        if(n-m+1>len)
            lo = m;
        len = Math.max(len,n-m+1);
    }
}
