package Remove9;


public class Remove9 {
    public static void main(String[] args) {
        System.out.print(new Remove9().newInteger(9));
    }
    public int newInteger(int n) {
        int ans = 0;
        int base = 1;

        while (n > 0){
            ans += n % 9 * base;
            n /= 9;
            base *= 10;
        }
        return ans;
    }
}
