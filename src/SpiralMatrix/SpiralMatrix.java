package SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4}};
        System.out.println(new SpiralMatrix().spiralOrder(matrix));
        System.exit(0);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length==0||matrix[0].length==0)
            return result;
        int rm = matrix.length-1,rn = matrix[0].length-1;
        int lm = 0,ln = 0;
        while (lm<rm||ln<rn){
            if(lm<=rm) {
                for (int i = ln; i <= rn; i++)
                    result.add(matrix[lm][i]);
                lm++;
            }
            if(ln<=rn){
                for(int j = lm;j<=rm;j++)
                    result.add(matrix[j][rn]);
                rn--;
            }
            if(lm<=rm){
                for(int k = rn;k>=ln;k--)
                    result.add(matrix[rm][k]);
                rm--;
            }
            if(ln<=rn){
                for(int l = rm;l>=lm;l--)
                    result.add(matrix[l][ln]);
                ln++;
            }
        }
        if(matrix.length==matrix[0].length&&matrix.length%2==1)
            result.add(matrix[lm][ln]);
        return result;
    }
}
