package Combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(new Combinations().combine(4,2));
    }
    public List<List<Integer>> combine(int n, int k) {
        List result = new ArrayList();
        backtrack(result,new ArrayList<Integer>(),1,n,k);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> temres,int i,int n,int k){
        if(temres.size()==k)
            result.add(new ArrayList<>(temres));
        else {
            while (i<=n){
                temres.add(i);
                backtrack(result,temres,++i,n,k);
                temres.remove(temres.size()-1);
            }
        }
    }
}
