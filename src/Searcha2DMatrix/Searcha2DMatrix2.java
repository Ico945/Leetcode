package Searcha2DMatrix;

public class Searcha2DMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5}};
        System.out.println(new Searcha2DMatrix2().searchMatrix(matrix,1));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
            return false;
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
