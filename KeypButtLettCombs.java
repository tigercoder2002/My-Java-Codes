// Keypad Buttons (2-9) Letter Combinations.
import java.util.*;
class KeypButtLettCombs{
    public static void main(String args[]){
        String digs="0";
        for(;(digs.indexOf('0')!=-1) || (digs.indexOf('1')!=-1);){
        System.out.print("\fEnter a combination of digits (2-9): ");
        digs=new Scanner(System.in).next();
        }
        System.out.print("Possible Letter Combinations from the Keypad Button Digits entered: ");
        keypLettCombs(digs,"");
    }
    static void keypLettCombs(String d, String comb){
        String letts[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(d.length()==0){
            System.out.print(comb+", ");
            return;
        }
        String curr=letts[d.charAt(0)-'2'];
        for(char ch: curr.toCharArray())
            keypLettCombs(d.substring(1),(comb+ch));
    }
}