package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.print(new PascalsTriangle().generate(4));
    }
    public List<List<Integer>> generate(int numRows) {
        List<Integer> temres = new ArrayList<>();
        List<Integer> oldtem = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0)
            return result;
        if(numRows == 1)
        {
            temres.add(1);
            result.add(temres);
            return result;
        }
        temres.add(1);
        result.add(new ArrayList<>(temres));
        for(int i = 2;i<=numRows;i++)
        {
            temres = new ArrayList<>();
            temres.add(1);
            for(int j = 1;j<i-1;j++)
            {
                temres.add(oldtem.get(j-1)+oldtem.get(j));
            }
            temres.add(1);
            oldtem = new ArrayList<>(temres);
            result.add(temres);
        }
        return result;
    }
}
