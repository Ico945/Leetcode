package ContainerWithMostWater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int hi = height.length-1;
        int lo = 0;
        int s = area(lo,height[lo],hi,height[hi]);
        while (lo<hi)
        {
            if (height[lo]<height[hi])
                lo++;
            else hi--;
            s = Math.max(s,area(lo,height[lo],hi,height[hi]));
        }
        return s;
    }
    public int area(int i,int ai,int j,int aj)
    {
        return (j-i)*Math.min(ai,aj);
    }
}
