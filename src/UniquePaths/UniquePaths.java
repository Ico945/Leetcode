package UniquePaths;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.print(new UniquePaths().uniquePaths(10,10));
    }
    public int uniquePaths(int m, int n) {
        if(m==1||n==1)
            return 1;
        m--;n--;
        double max = m+n;
        double min = Math.min(n,m);
        double result = 1;
        while (min>0){
            result *= max/min;
            max--;min--;
        }
        return (int)Math.round(result);
    }
}
