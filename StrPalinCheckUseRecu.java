// String Palindrome Checker using Recursion.
import java.util.*;
class StrPalinCheckUseRecu{
    public static void main(String args[]){
        System.out.print("\fEnter a String: ");
        String str=new Scanner(System.in).next();
        System.out.println((checkPalin(str.toUpperCase())?"Palindrome String.":"Not a Palindrome String."));
    }
    static boolean checkPalin(String s){
        if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        checkPalin(s.substring(1,s.length()));
        return true;
    }
}