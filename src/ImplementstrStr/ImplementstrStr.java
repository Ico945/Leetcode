package ImplementstrStr;

public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "abcdefg";
        String needle = "ef";
        System.out.println(new ImplementstrStr().strStr(haystack,needle));
    }
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
