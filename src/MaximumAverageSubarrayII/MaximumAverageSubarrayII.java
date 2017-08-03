package MaximumAverageSubarrayII;

public class MaximumAverageSubarrayII {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        //System.out.println(nums[791]);
        //System.out.println(new MaximumAverageSubarrayII().findave(nums,123,393));
        System.out.println(new MaximumAverageSubarrayII().findMaxAverage(nums,k));
    }
    public double findMaxAverage(int[] nums, int k) {
        double l = -10000,r = 10001;
        while(r-l>0.00001)
        {
            double mid = (l+r)/2;
            if(check(nums,k,mid))
                l = mid;
            else
                r = mid;
        }
        return r;
    }
    boolean check(int[] nums,int k,double mid)
    {
        double sums=0,sums2=0;
        for(int i = 0;i<k;i++)
            sums += nums[i] - mid;
        if(sums>=0)
            return true;
        for(int i = k;i<nums.length;i++)
        {
            sums += nums[i]-mid;
            sums2 += nums[i-k]-mid;
            if(sums2<0)
            {
                sums -= sums2;
                sums2 = 0;
            }
            if(sums>=0)
                return true;
        }
        return false;
    }
}
