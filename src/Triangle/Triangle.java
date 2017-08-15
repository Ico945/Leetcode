package Triangle;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<Integer> sonlist1 = new ArrayList<>();
        List<List<Integer>> triangle = new ArrayList<>();
        sonlist1.add(-10);
        List<Integer> sonlist2 = new ArrayList<>();
        sonlist2.add(3);sonlist2.add(4);
        List<Integer> sonlist3 = new ArrayList<>();
        sonlist3.add(6);sonlist3.add(5);sonlist3.add(7);
        List<Integer> sonlist4 = new ArrayList<>();
        sonlist4.add(4);sonlist4.add(1);sonlist4.add(8);sonlist4.add(3);
        triangle.add(sonlist1);/*triangle.add(sonlist2);
        triangle.add(sonlist3);triangle.add(sonlist4);*/
        System.out.print(new Triangle().minimumTotal(triangle));
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> losontriangle ;
        List<Integer> hisontriangle= new ArrayList<>();
        for(int i = triangle.size()-1;i>0;i--)
        {
            losontriangle = triangle.get(i);
            hisontriangle = triangle.get(i-1);
            for(int j = 0;j<hisontriangle.size();j++)
                hisontriangle.set(j,Math.min(hisontriangle.get(j)+losontriangle.get(j),hisontriangle.get(j)+losontriangle.get(j+1)));
        }
        return triangle.get(0).get(0);
    }
}
