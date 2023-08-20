// Displaying words beginning and ending with same alphabet.
import java.util.*;
class MyString{
    String str;
    MyString(){
        str="";
    }
    void accept(){
        System.out.print("\fEnter a sentence in UPPER case: ");
        str=new Scanner(System.in).nextLine();
        str=str.replace(str.charAt(str.length()-1),' ');
    }
    void show(){
        System.out.print("The word(s) beginning and ending with the same alphabet are: ");
        for(int i=0;i<str.length();i=str.indexOf(' ',i)+1)
            if(check(str.substring(i,str.indexOf(' ',i))))
                System.out.print(str.substring(i,str.indexOf(' ',i))+", ");
            }
    public static void main(String args[]){
        MyString obj=new MyString();
        obj.accept();  obj.show();
    }
    boolean check(String s){
        return (s.charAt(0)==s.charAt(s.length()-1))?true:false;
    }
}