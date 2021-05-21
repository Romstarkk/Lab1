import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)
            {
                String s=args[i];
                if (isPalindrome(s)) System.out.println(s + " - Palindrome");
            }
        }
    public static String reverseString(String s){
        String ret="";
        for(int i=0;i<s.length();i++) ret += s.charAt(s.length() - i - 1);
        return ret;
    }
    public static boolean isPalindrome(String s){
        String re_s=reverseString(s);
        return re_s.equals(s);
    }
}
