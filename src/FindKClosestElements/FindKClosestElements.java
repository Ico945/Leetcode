package FindKClosestElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKClosestElements {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int k = 4,x = -1;
        System.out.print(new FindKClosestElements().findClosestElements(arr,k,x));
    }
    public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int lo = 0;
        int hi = arr.size()-1;
        int mid = (lo+hi)/2;
        while (lo<hi)
        {
            if(arr.get(mid) == x)
                break;
            else if (arr.get(mid)<x)
                lo = mid+1;
            else
                hi = mid-1;
            mid = (lo+hi)/2;
        }
        result.add(arr.get(mid));
        k--;
        lo = mid-1;hi = mid+1;
        while(k>0&&lo>=0&&hi<=arr.size()-1)
        {
            if(Math.abs(arr.get(lo)-x)<=Math.abs(arr.get(hi)-x))
            {
                result.add(arr.get(lo));
                lo--;
            }
            else {
                result.add(arr.get(hi));
                hi++;
            }
            k--;
        }
        if(lo<0)
        {
            while (k>0)
            {
                result.add(arr.get(hi));
                hi++;
                k--;
            }
        }
        if(hi>arr.size()-1)
        {
            while (k>0)
            {
                result.add(arr.get(lo));
                lo--;
                k--;
            }
        }
        Collections.sort(result);
        return result;
    }
}
