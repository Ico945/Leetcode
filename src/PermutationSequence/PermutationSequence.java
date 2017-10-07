package PermutationSequence;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
            System.out.println(new PermutationSequence().getPermutation(5,119));
    }
    public String getPermutation(int n, int k) {
        List result = new ArrayList<StringBuilder>();
        boolean[] visit = new boolean[n];
        backtrack(result,new StringBuilder(n),n,visit);
        return result.get(k-1).toString();
    }
    void backtrack(List result,StringBuilder temresult,int n,boolean[] visit){
        if(temresult.length() == n) {
            result.add(new StringBuilder(temresult));
            return;
        }
        for(int i = 1;i<=n;i++){
            if(!visit[i-1]){
                visit[i-1] = true;
                temresult.append(i);
                backtrack(result, temresult, n,visit);
                visit[i-1] = false;
                temresult.deleteCharAt(temresult.length() - 1);
            }
        }
    }
}
