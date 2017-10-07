package MultiplyStrings;

public class MultiplyStrings2 {
    public static void main(String[] args) {
        String num1 = "102",num2 = "10";
        System.out.println(new MultiplyStrings2().multiply(num1,num2));
    }
    public String multiply(String num1, String num2) {
        int n = num1.length(),m = num2.length();
        int temsum,p1,p2;
        int[] pos = new int[n+m];
        for(int i = n-1;i>=0;i--){
            for(int j = m-1;j>=0;j--){
                p1 = i+j;p2 = i+j+1;
                temsum = (num1.charAt(i)-'0')*(num2.charAt(j)-'0')+pos[p2];
                pos[p2] = temsum%10;
                pos[p1] += temsum/10;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int p : pos)
            if(!(res.length() == 0 && p == 0))
                res.append(p);
        return res.length() == 0 ? "0" : res.toString();
    }
}
