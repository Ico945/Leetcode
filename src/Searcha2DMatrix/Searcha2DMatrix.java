package Searcha2DMatrix;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1},{3}};
        System.out.println(new Searcha2DMatrix().searchMatrix(matrix,0));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
            return false;
        int lo = 0,hi = matrix.length-1;
        while (lo<hi){
            if(matrix[(lo+hi)/2][0]==target)
                return true;
            else if(matrix[(lo+hi)/2][0]>target)
                hi = (lo+hi)/2-1;
            else lo = (lo+hi)/2+1;
        }
        int index = lo;
        hi = matrix[lo].length-1;
        lo = 0;
        if(hi==0&&matrix[index][0]==target)
            return true;
        while (lo<hi){
            if(matrix[index][(lo+hi)/2]==target)
                return true;
            else if(matrix[index][(lo+hi)/2]>target)
                hi = (lo+hi)/2-1;
            else lo = (lo+hi)/2+1;
        }
        return false;
    }
}
