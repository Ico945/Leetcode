package PalindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.print(new PalindromeNumber().isPalindrome(1232));
    }
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int xvalue = x;
        int y = 0;
        while (x != 0)
        {
            y = y*10+x%10;
            x /= 10;
        }
        return (xvalue == y);
    }
}
