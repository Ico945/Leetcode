package SpiralMatrixII;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int[][] result = new SpiralMatrixII().generateMatrix(3);
        for(int i = 0;i<3;i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if(n%2!=0)
            result[n/2][n/2] = n*n;
        int ln = 0,lm = 0,count = 1;
        int rn = n-1,rm = n-1;
        while (ln<rn&&lm<rm){
            for(int i = ln;i<=rn;i++) {
                result[lm][i] = count;
                count++;
            }
            lm++;
            for(int j = lm;j<=rm;j++){
                result[j][rn] = count;
                count++;
            }
            rn--;
            for(int k = rn;k>=ln;k--){
                result[rm][k] = count;
                count++;
            }
            rm--;
            for(int l = rm;l>=lm;l--){
                result[l][ln] = count;
                count++;
            }
            ln++;
        }
        return result;
    }
}
