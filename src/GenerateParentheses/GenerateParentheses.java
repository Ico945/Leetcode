package GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(new GenerateParentheses().generateParenthesis(3));
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuffer temres = new StringBuffer();
        backrack(result,temres,n,0,0);
        return result;
    }
    public void backrack(List<String> result,StringBuffer temres,int n,int i,int j){
        if(temres.length() == 2*n&&juge(temres.toString()))
            result.add(temres.toString());
        else {
            while (i<n){
                temres.append("(");
                backrack(result,temres,n,i+1,j);
                temres.deleteCharAt(temres.length()-1);
                break;
            }
            while (j<n){
                temres.append(")");
                backrack(result,temres,n,i,j+1);
                temres.deleteCharAt(temres.length()-1);
                break;
            }
        }
    }
    public boolean juge(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '(')
                count++;
            if(str.charAt(i) == ')')
                count--;
            if(count<0)
                return false;
        }
        if(count != 0)
            return false;
        else return true;
    }
}
