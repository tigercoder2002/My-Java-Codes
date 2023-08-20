// Russian Peasant Multiplication Program.
import java.util.*;
class RussPeaMult{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter two numbers, seperated by spaces: ");
        int a=inp.nextInt(), b=inp.nextInt();
        int first[]=new int[a/2];
        int second[]=new int[a/2];
        for(int i=0,x=a,y=b;i<(a/2);first[i]=x,second[i]=y,x/=2,y*=2,i++);
        int res=0;
        for(int i=0;i<(a/2);res+=(first[i]%2!=0)?second[i]:0,i++);
        System.out.print("Multiplication result="+res);
    }
}