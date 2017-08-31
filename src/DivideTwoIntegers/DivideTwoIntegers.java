package DivideTwoIntegers;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.print(new DivideTwoIntegers().divide(-2147483648,-1));
    }
    public int divide(int dividend, int divisor) {
        int count = 1;
        if(dividend>0)
        {
            if(divisor==0)
                return Integer.MAX_VALUE;
            else if(divisor<0)
            {
                count = -1;
                divisor = -divisor;
            }
            else count = 1;
        }
        if(dividend==0)
        {
            if(divisor!=0)
                return 0;
            else return Integer.MAX_VALUE;
        }
        if(dividend<0)
        {
            if(divisor==0)
                return Integer.MIN_VALUE;
            else if(divisor<0)
            {
                count = 1;
                divisor = -divisor;
            }
            else count = -1;
            dividend = -dividend;
        }

        if(dividend<divisor)
            return 0;
        int result = 0;
        while (dividend>=0)
        {
            dividend -= divisor;
            result++;
        }
        if(count > 0)
            return result-1;
        else return 1-result;
    }
}
