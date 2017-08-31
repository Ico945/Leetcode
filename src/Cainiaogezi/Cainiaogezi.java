package Cainiaogezi;

public class Cainiaogezi {
    public static void main(String[] args) {
        System.out.println(new Cainiaogezi().number(71));
    }
    int number(int k){
        StringBuffer re = new StringBuffer();
        int n = 0;
        while (n*(n+1)/2<k)
        {
            int j = 0;
            while (j<n)
            {
                j++;
                re.append(j+"");
            }
            n++;
        }
        n--;
        int j = 0;
        while (j<k-n*(n+1)/2)
        {
            j++;
            re.append(j+"");
        }
        //System.out.print(re);
        return Integer.parseInt(String.valueOf(re.charAt(k-1)));
        //return re.charAt(k-1);
    }
}
