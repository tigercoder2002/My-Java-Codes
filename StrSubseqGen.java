// String Subsequences Generator.
import java.util.*;
class StrSubseqGen{
    public static void main(String args[]){
        System.out.print("\fEnter a String: ");
        String str=new Scanner(System.in).next();
        System.out.println("The Subsequences are: "+genSubSeq(str));
    }
    static ArrayList<String> genSubSeq(String s){
        ArrayList<String> arr=new ArrayList<>();
        if(s.length()==0){
            arr.add("");
            return arr;
        }
        for(String sub: genSubSeq(s.substring(1))){
            arr.add(sub);
            arr.add(s.charAt(0)+sub);
        }
        return arr;
    }
}