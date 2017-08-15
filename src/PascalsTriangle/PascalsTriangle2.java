package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args) {
        System.out.print(new PascalsTriangle2().generate(7));
    }
    public List<List<Integer>> generate(int numRows) {
        List<Integer> temres = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<numRows;i++ )
        {
            temres.add(0,1);
            for(int j = 1;j<temres.size()-1;j++)
            {
                temres.set(j,temres.get(j)+temres.get(j+1));
            }
            result.add(new ArrayList<>(temres));
        }
        return result;
    }
}
