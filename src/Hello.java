import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Map<String, Integer>[] map = new Map[4];
        map[0] = new HashMap<>();
        map[0].put("w_1",1);
        map[1] = new HashMap<>();
        map[1].put("w_2",2);
        map[2] = new HashMap<>();
        map[2].put("w_3",2);
        map[3] = new HashMap<>();
        map[3].put("w_4",3);
        for(int i = 0;i<100;i++)
            System.out.println(new Hello().work(map));
    }
    public String work(Map<String,Integer>[] map){
        int len = map.length;
        int sum = 0;
        for(int i = 1;i<=len;i++){
            sum += map[i-1].get("w_"+i);
        }
        int random = (int)(Math.random()*sum+1);
        int count = 0;
        for(int i = 1;i<=len;i++){
            count += map[i-1].get("w_"+i);
            if(count>=random)
                return "w_"+i;
        }
        return "";
    }
}
