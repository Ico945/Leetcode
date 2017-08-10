package MergeIntervals;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(0,4));
        //intervals.add(new Interval(8,10));
        //intervals.add(new Interval(15,18));
        //System.out.println(intervals.get(0).end);
        System.out.println(new MergeIntervals().merge(intervals).get(0).start);
    }
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        for(int i = 0;i<intervals.size()-1;)
        {
            if(intervals.get(i).end>=intervals.get(i+1).start)
            {
                if(intervals.get(i).end<=intervals.get(i+1).end)
                    intervals.get(i).end = intervals.get(i+1).end;
                intervals.remove(i+1);
            }
            else i++;
        }
        return intervals;
    }
}

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
