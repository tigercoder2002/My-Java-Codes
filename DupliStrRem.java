// Duplicate String Manipulator, with Remaining Alphabets.
import java.util.*;
class DupliStrRem{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter a string: ");
        String str=inp.nextLine().replace(' ','\0');
        String dupliremstr="";
        for(int i=0;i<str.length();i++)
            if(i==str.indexOf(str.charAt(i)))
                dupliremstr+=str.charAt(i);
        System.out.println("String without duplicate letters: "+dupliremstr);
        String alp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<str.length();i++)
            if(alp.indexOf(str.charAt(i))!=-1)
                alp=alp.replace(str.charAt(i),'\0');
        System.out.println("String without duplicate letters, and with remaining alphabets: "+dupliremstr+alp);
    }
}