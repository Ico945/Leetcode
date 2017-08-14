import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        String s = "ABABAA";
        System.out.print(new Hello().Isgood(s));
    }
    public boolean Isgood(String s){
        int count = 0;
        for(int i = 0;i<s.length()-1;i++)
        {
            if(s.charAt(i) != s.charAt(i+1))
                count++;
            if(count>1)
                return false;
        }
        return true;
    }
}
