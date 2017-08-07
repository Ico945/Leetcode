package ReverseInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(new ReverseInteger().reverse(x));
    }
    public int reverse(int x) {
        int t=1;
        if(x<0)
            t = -1;
        x = Math.abs(x);
        long result = x%10;
        while (x/10 != 0)
        {
            result *= 10;
            result += x/10%10;
            x /= 10;
        }
        if(result<Integer.MIN_VALUE || result>Integer.MAX_VALUE)
            return 0;
        result *= t;
        return (int)result;
    }
}
