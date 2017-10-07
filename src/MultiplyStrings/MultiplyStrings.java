package MultiplyStrings;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "691325924134",num2 = "723231103343";
        System.out.println(new MultiplyStrings().multiply(num1,num2));
    }
    public String multiply(String num1, String num2) {
        StringBuffer result1 = new StringBuffer();
        int count = 0,index = 0;
        String[] str = new String[num1.length()*num2.length()];
        for(int i = num1.length()-1;i>=0;i--){
            for(int j = num2.length()-1;j>=0;j--){
                str[index] = (num1.charAt(i)-'0')*(num2.charAt(j)-'0')+"";
                for(int m = 0;m<num1.length()-1-i;m++)
                    str[index] = str[index]+"0";
                int temlen = str[index].length();
                for(int k = 0;k<num1.length()+num2.length()-1-temlen;k++)
                    str[index] = "0"+str[index];
                index++;
            }
        }
        for(int i = 0;i<num1.length()+num2.length()-1;i++){
            int tem = count;
            for(int j = str.length-1;j>=0;j--){
                tem += str[j].charAt(i)-'0';
            }
            count = tem/10;
            result1.append(tem%10+"");
        }
        if(count == 0)
            return result1.reverse().toString();
        else
            return count+result1.reverse().toString();
    }
}
