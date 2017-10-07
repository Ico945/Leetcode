package RotateImage;

import java.util.ArrayList;
import java.util.List;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        new RotateImage().rotate(matrix);
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length-1;//n = 3
        while (n>0){
            int i = 0;
            int j = 0;
            int temn = n;
            while (i<n-1){
                int[] temp = new int[n];
                System.arraycopy(matrix[i],0,temp,0,n);
                while (j<n){
                    matrix[i][j] = matrix[temn-i][i];
                    matrix[temn-i][i] = matrix[n][n-j];
                    matrix[n][n-j] = matrix[j][temn];
                    matrix[j][temn] = temp[j];
                    j++;
                    temn--;
                }
                i++;
            }
            n--;
        }
    }
}
